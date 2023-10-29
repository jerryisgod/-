<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Payment Success</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            text-align: center;
            margin: 0;
            padding: 0;
        }

        h1 {
            color: #0073e6;
        }

        .container {
            background-color: #ffffff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            max-width: 400px;
            margin: 0 auto;
            margin-top: 50px;
        }

        p {
            font-size: 18px;
            margin: 10px 0;
        }

        .item {
            color: #009688;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>付款成功!!!</h1>
        <p>訂單編號: ${merchantTradeNo}</p>
        <p>付款日期: ${merchantTradeDate}</p>
        <p>購買人: jerry</p>
        <p>付款金額: ${totalAmount} TWD</p>
        <p>備註: ${tradeDesc}</p>
        <p>遊戲商品: <span class="item">CS:GO ${itemName}</span></p>
    </div>
</body>
<script type="text/javascript">
const merchantTradeNo = "${merchantTradeNo}";
const merchantTradeDate = "${merchantTradeDate}";
const userId = "${user}";
const totalAmount = "${totalAmount}";
const itemName = "${itemName}";

fetch('http://localhost:8080/saveOrder', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
    },
    body: JSON.stringify({
      merchantTradeNo: merchantTradeNo,
      merchantTradeDate: merchantTradeDate,
      userId: userId,
      totalAmount: totalAmount,
      itemName: itemName,
    })
})
.then(response => response.json())
.then(data => {
    console.log("Order saved:", data);
})
.catch(error => {
    console.log("Error saving order:", error);
});
</script>
</html>
