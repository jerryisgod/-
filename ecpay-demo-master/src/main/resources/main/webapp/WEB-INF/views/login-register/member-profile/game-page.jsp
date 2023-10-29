<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 


<!DOCTYPE html><!--  This site was created in Webflow. https://www.webflow.com  -->
<!--  Last Published: Wed Sep 13 2023 01:56:47 GMT+0000 (Coordinated Universal Time)  -->
<html data-wf-page="650071e17cd3c26438525fbd" data-wf-site="64e5ed3359b16400aec286b0">
<head>
  <meta charset="utf-8">
  <title>game_page</title>
  <meta content="game_page" property="og:title">
  <meta content="game_page" property="twitter:title">
  <meta content="width=device-width, initial-scale=1" name="viewport">
  <meta content="Webflow" name="generator">
  <link rel='stylesheet' href="<c:url value='/css/normalize.css' />"  type="text/css" />
  <link rel='stylesheet' href="<c:url value='/css/webflow.css' />"  type="text/css" />
  <link rel='stylesheet' href="<c:url value='/css/5teams-wondrous-site.webflow.css' />"  type="text/css" />
  <link href="https://fonts.googleapis.com" rel="preconnect">
  <link href="https://fonts.gstatic.com" rel="preconnect" crossorigin="anonymous">
  <script src="https://ajax.googleapis.com/ajax/libs/webfont/1.6.26/webfont.js" type="text/javascript"></script>
  <script type="text/javascript">WebFont.load({  google: {    families: ["Open Sans:300,300italic,400,400italic,600,600italic,700,700italic,800,800italic","Varela Round:400","Exo:100,100italic,200,200italic,300,300italic,400,400italic,500,500italic,600,600italic,700,700italic,800,800italic,900,900italic","Oswald:200,300,400,500,600,700","Great Vibes:400"]  }});</script>
  <script type="text/javascript">!function(o,c){var n=c.documentElement,t=" w-mod-";n.className+=t+"js",("ontouchstart"in o||o.DocumentTouch&&c instanceof DocumentTouch)&&(n.className+=t+"touch")}(window,document);</script>
  <link href="images/favicon.png" rel="shortcut icon" type="image/x-icon">
  <link href="images/webclip.png" rel="apple-touch-icon">
</head>
<body class="body-6">
  <div data-collapse="medium" data-animation="default" data-duration="400" data-easing="ease" data-easing2="ease" role="banner" class="nav-bar-c77py w-nav">
    <div class="nav-main">
      <div class="wrapper nav-bar-wrapper">
        <a href="index.html" class="brand w-nav-brand">
          <div><img src="images/LOGO.png" loading="lazy" width="214" sizes="(max-width: 479px) 55vw, 213.99147033691406px" alt="" srcset="images/LOGO-p-500.png 500w, images/LOGO.png 556w"></div>
        </a>
        <div class="navigation">
          <nav role="navigation" class="nav-menu w-nav-menu">
            <a href="index.html" class="nav-link w-nav-link">首頁</a>
            <div data-hover="false" data-delay="0" class="dropdown w-dropdown">
              <div class="dropdown-toggle w-dropdown-toggle">
                <div class="icon w-icon-dropdown-toggle"></div>
                <div>遊戲類別</div>
              </div>
              <nav class="w-dropdown-list">
                <a href="game-search-page/view-purchase-history-copy-3.html" class="dropdown-link w-dropdown-link">射擊遊戲</a>
                <a href="game-search-page/view-purchase-history-copy-3.html" class="dropdown-link-2 w-dropdown-link">動作冒險</a>
                <a href="game-search-page/view-purchase-history-copy-3.html" class="dropdown-link-3 w-dropdown-link">角色扮演</a>
                <a href="game-search-page/view-purchase-history-copy-3.html" class="dropdown-link-4 w-dropdown-link">即時戰略</a>
                <a href="game-search-page/view-purchase-history-copy-3.html" class="dropdown-link-5 w-dropdown-link">卡牌策略</a>
              </nav>
            </div>
            <a href="topup.html" class="nav-link w-nav-link">點數商店</a>
            <a href="account-details/news-copy-2.html" class="nav-link w-nav-link">消息新聞</a>
            <div><img src="images/螢幕擷取畫面_2023-09-02__1_-removebg-preview-removebg-preview.png" loading="lazy" width="68" sizes="(max-width: 991px) 100vw, (max-width: 1439px) 5vw, 67.99715423583984px" alt="" srcset="images/螢幕擷取畫面_2023-09-02__1_-removebg-preview-removebg-preview-p-500.png 500w, images/螢幕擷取畫面_2023-09-02__1_-removebg-preview-removebg-preview.png 552w"></div>
            <div data-hover="false" data-delay="0" class="dropdown w-dropdown">
              <div class="dropdown-toggle w-dropdown-toggle">
                <div class="icon w-icon-dropdown-toggle"></div>
                <div>會員中心</div>
              </div>
              <nav class="w-dropdown-list">
                <a href="member-profile/member-profile.html" class="dropdown-link w-dropdown-link">個人資料</a>
                <a href="member-profile/friend-list.html" class="dropdown-link-2 w-dropdown-link">好友</a>
                <a href="member-profile/game-library.html" class="dropdown-link-3 w-dropdown-link">遊戲庫</a>
                <a href="account-details/coupon.html" class="dropdown-link-4 w-dropdown-link">我的優惠卷</a>
                <a href="account-details/viewpurchasehistory.html" class="dropdown-link-5 w-dropdown-link">檢視購買記錄</a>
              </nav>
            </div>
            <a href="login-register/model2.html" class="nav-link w-nav-link">註冊</a>
            <a href="login-register/loginpage.html" class="nav-link w-nav-link">登入</a>
          </nav>
          <div class="menu-button w-nav-button">
            <div class="icon-2 w-icon-nav-menu"></div>
          </div>
          <div data-node-type="commerce-cart-wrapper" data-open-product="" data-wf-cart-type="rightDropdown" data-wf-cart-query="" data-wf-page-link-href-prefix="" class="w-commerce-commercecartwrapper cart">
            <a href="#" data-node-type="commerce-cart-open-link" class="w-commerce-commercecartopenlink cart-button w-inline-block" role="button" aria-haspopup="dialog" aria-label="Open cart">
              <div class="w-inline-block">購物車</div><img src="images/cart-icon.svg" alt="" class="cart-icon">
              <div style="display:none" data-count-hide-rule="empty" class="w-commerce-commercecartopenlinkcount item-count">0</div>
            </a>
            <div data-node-type="commerce-cart-container-wrapper" style="display:none" class="w-commerce-commercecartcontainerwrapper w-commerce-commercecartcontainerwrapper--cartType-rightDropdown">
              <div data-node-type="commerce-cart-container" role="dialog" class="w-commerce-commercecartcontainer cart-container">
                <div class="w-commerce-commercecartheader cart-header">
                  <h4 class="w-commerce-commercecartheading">我的購物車</h4>
                  <a href="#" data-node-type="commerce-cart-close-link" class="w-commerce-commercecartcloselink w-inline-block" role="button" aria-label="Close cart"><svg width="16px" height="16px" viewbox="0 0 16 16">
                      <g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd">
                        <g fill-rule="nonzero" fill="#333333">
                          <polygon points="6.23223305 8 0.616116524 13.6161165 2.38388348 15.3838835 8 9.76776695 13.6161165 15.3838835 15.3838835 13.6161165 9.76776695 8 15.3838835 2.38388348 13.6161165 0.616116524 8 6.23223305 2.38388348 0.616116524 0.616116524 2.38388348 6.23223305 8"></polygon>
                        </g>
                      </g>
                    </svg></a>
                </div>
                <div class="w-commerce-commercecartformwrapper">
                  <form data-node-type="commerce-cart-form" style="display:none" class="w-commerce-commercecartform">
                    <script type="text/x-wf-template" id="wf-template-9336d8a7-ba52-2880-0c69-78271ccadf80"></script>
                    <div class="w-commerce-commercecartlist cart-list" data-wf-collection="database.commerceOrder.userItems" data-wf-template-id="wf-template-9336d8a7-ba52-2880-0c69-78271ccadf80"></div>
                    <div class="w-commerce-commercecartfooter cart-footer">
                      <div aria-live="" aria-atomic="false" class="w-commerce-commercecartlineitem">
                        <div>總價</div>
                        <div class="w-commerce-commercecartordervalue">000.00元</div>
                      </div>
                      <div>
                        <div data-node-type="commerce-cart-quick-checkout-actions">
                          <a role="button" aria-haspopup="dialog" aria-label="Apple Pay" data-node-type="commerce-cart-apple-pay-button" style="background-image:-webkit-named-image(apple-pay-logo-white);background-size:100% 50%;background-position:50% 50%;background-repeat:no-repeat" class="w-commerce-commercecartapplepaybutton cart-pay-button" tabindex="0">
                            <div></div>
                          </a>
                          <a role="button" tabindex="0" aria-haspopup="dialog" data-node-type="commerce-cart-quick-checkout-button" style="display:none" class="w-commerce-commercecartquickcheckoutbutton cart-pay-button"><svg class="w-commerce-commercequickcheckoutgoogleicon" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" width="16" height="16" viewbox="0 0 16 16">
                              <defs>
                                <polygon id="google-mark-a" points="0 .329 3.494 .329 3.494 7.649 0 7.649"></polygon>
                                <polygon id="google-mark-c" points=".894 0 13.169 0 13.169 6.443 .894 6.443"></polygon>
                              </defs>
                              <g fill="none" fill-rule="evenodd">
                                <path fill="#4285F4" d="M10.5967,12.0469 L10.5967,14.0649 L13.1167,14.0649 C14.6047,12.6759 15.4577,10.6209 15.4577,8.1779 C15.4577,7.6339 15.4137,7.0889 15.3257,6.5559 L7.8887,6.5559 L7.8887,9.6329 L12.1507,9.6329 C11.9767,10.6119 11.4147,11.4899 10.5967,12.0469"></path>
                                <path fill="#34A853" d="M7.8887,16 C10.0137,16 11.8107,15.289 13.1147,14.067 C13.1147,14.066 13.1157,14.065 13.1167,14.064 L10.5967,12.047 C10.5877,12.053 10.5807,12.061 10.5727,12.067 C9.8607,12.556 8.9507,12.833 7.8887,12.833 C5.8577,12.833 4.1387,11.457 3.4937,9.605 L0.8747,9.605 L0.8747,11.648 C2.2197,14.319 4.9287,16 7.8887,16"></path>
                                <g transform="translate(0 4)">
                                  <mask id="google-mark-b" fill="#fff">
                                    <use xlink:href="#google-mark-a"></use>
                                  </mask>
                                  <path fill="#FBBC04" d="M3.4639,5.5337 C3.1369,4.5477 3.1359,3.4727 3.4609,2.4757 L3.4639,2.4777 C3.4679,2.4657 3.4749,2.4547 3.4789,2.4427 L3.4939,0.3287 L0.8939,0.3287 C0.8799,0.3577 0.8599,0.3827 0.8459,0.4117 C-0.2821,2.6667 -0.2821,5.3337 0.8459,7.5887 L0.8459,7.5997 C0.8549,7.6167 0.8659,7.6317 0.8749,7.6487 L3.4939,5.6057 C3.4849,5.5807 3.4729,5.5587 3.4639,5.5337" mask="url(#google-mark-b)"></path>
                                </g>
                                <mask id="google-mark-d" fill="#fff">
                                  <use xlink:href="#google-mark-c"></use>
                                </mask>
                                <path fill="#EA4335" d="M0.894,4.3291 L3.478,6.4431 C4.113,4.5611 5.843,3.1671 7.889,3.1671 C9.018,3.1451 10.102,3.5781 10.912,4.3671 L13.169,2.0781 C11.733,0.7231 9.85,-0.0219 7.889,0.0001 C4.941,0.0001 2.245,1.6791 0.894,4.3291" mask="url(#google-mark-d)"></path>
                              </g>
                            </svg><svg class="w-commerce-commercequickcheckoutmicrosofticon" xmlns="http://www.w3.org/2000/svg" width="16" height="16" viewbox="0 0 16 16">
                              <g fill="none" fill-rule="evenodd">
                                <polygon fill="#F05022" points="7 7 1 7 1 1 7 1"></polygon>
                                <polygon fill="#7DB902" points="15 7 9 7 9 1 15 1"></polygon>
                                <polygon fill="#00A4EE" points="7 15 1 15 1 9 7 9"></polygon>
                                <polygon fill="#FFB700" points="15 15 9 15 9 9 15 9"></polygon>
                              </g>
                            </svg>
                            <div>Pay with browser.</div>
                          </a>
                        </div>
                      </div>
                    </div>
                  </form>
                  <div class="w-commerce-commercecartemptystate">
                    <div>No items found.</div>
                  </div>
                  <div aria-live="" style="display:none" data-node-type="commerce-cart-error" class="w-commerce-commercecarterrorstate form-error">
                    <div class="w-cart-error-msg" data-w-cart-quantity-error="Product is not available in this quantity." data-w-cart-general-error="Something went wrong when adding this item to the cart." data-w-cart-checkout-error="Checkout is disabled on this site." data-w-cart-cart_order_min-error="The order minimum was not met. Add more items to your cart to continue." data-w-cart-subscription_error-error="Before you purchase, please use your email invite to verify your address so we can send order updates.">Product is not available in this quantity.</div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="f-section-regular">
    <div class="f-container-regular-3">
      <div class="w-layout-grid f-grid-two-column">
        <div id="w-node-_112e0a88-f751-9f17-f1ba-d03edf5bd3ae-38525fbd" class="f-content-image-wrapper"><img src="images/huntermonster_1.jpg" loading="lazy" srcset="images/huntermonster_1-p-500.jpg 500w, images/huntermonster_1-p-800.jpg 800w, images/huntermonster_1.jpg 1066w" sizes="(max-width: 991px) 90vw, 450.0000305175781px" alt="" class="f-image-cover-4"></div>
        <div id="w-node-_112e0a88-f751-9f17-f1ba-d03edf5bd3b0-38525fbd">
          <div class="f-margin-bottom-79">
            <div class="f-heading-detail-small-5">魔物獵人</div>
          </div>
          <div class="f-margin-bottom-78">
            <h3 class="f-h3-heading-8">新的生命之地。狩獵, 就是本能! 「Monster Hunter: World」中, 玩家可以體驗終極的狩獵生活, 活用新建構的世界中各種各樣的地形 與生態環境享受狩獵的驚喜與興奮。</h3>
          </div>
          <div class="f-button-wrapper">
            <a href="#" class="f-button-neutral-5 w-inline-block">
              <div>下載遊戲</div>
            </a>
            <a href="#" class="f-button-secondary w-inline-block">
              <div>遊戲資訊</div>
            </a>
          </div>
        </div>
      </div>
    </div>
  </div>
  <section class="footer-light-co1518988py-copy">
    <div class="container">
      <div class="footer-wrapper-two">
        <a href="#" class="footer-brand-2 w-inline-block"><img src="images/LOGO.png" loading="lazy" width="253" sizes="(max-width: 479px) 88vw, 252.9861297607422px" alt="" srcset="images/LOGO-p-500.png 500w, images/LOGO.png 556w"></a>
        <div class="footer-block-two">
          <div class="footer-title">company</div>
          <a href="#" class="footer-link-two">How it works</a>
          <a href="#" class="footer-link-two">Pricing</a>
          <a href="#" class="footer-link-two">Docs</a>
        </div>
        <div class="footer-block-two">
          <div class="footer-title">Quick Link</div>
          <a href="#" class="footer-link-two">Pricing</a>
          <a href="#" class="footer-link-two">Resources</a>
        </div>
        <div class="footer-form w-form">
          <form id="wf-form-Footer-Form" name="wf-form-Footer-Form" data-name="Footer Form" method="get" class="footer-form-container" data-wf-page-id="650071e17cd3c26438525fbd" data-wf-element-id="5c3781a6-7817-0fe3-2a55-8f1805edea38">
            <div class="footer-title">Subscribe</div>
            <div class="footer-form-block"><input type="email" class="footer-form-field w-input" maxlength="256" name="Footer-Email-2" data-name="Footer Email 2" aria-label="Get product updates" placeholder="Get product updates" id="Footer-Email-2" required=""><input type="submit" value="" data-wait="Please wait..." class="footer-form-submit w-button"></div>
          </form>
          <div class="w-form-done">
            <div>Thank you! Your submission has been received!</div>
          </div>
          <div class="w-form-fail">
            <div>Oops! Something went wrong while submitting the form.</div>
          </div>
        </div>
      </div>
      <div class="footer-divider-two"></div>
    </div>
    <div class="footer-bottom-2">
      <div class="footer-copyright">© 2023 5team. All rights reserved </div>
      <div class="footer-copyright">
        <a href="#"><strong>聯繫我們:5team44684468@gmail.com</strong></a><strong> </strong>
      </div>
      <a href="#" class="footer-social-link-2 w-inline-block"><img src="images/face-removebg-preview.png" loading="lazy" width="96" alt="" class="image-41"></a>
      <a href="#" class="footer-social-link-2 w-inline-block"><img src="images/Twi-removebg-preview.png" loading="lazy" width="97" alt="" class="image-40"></a>
      <div class="footer-social-block-two">
        <a href="#" class="footer-social-link-2 w-inline-block"><img src="images/YT-removebg-preview.png" loading="lazy" width="93" alt=""></a>
      </div>
    </div>
  </section>
  <script src="https://d3e54v103j8qbb.cloudfront.net/js/jquery-3.5.1.min.dc5e7f18c8.js?site=64e5ed3359b16400aec286b0" type="text/javascript" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
  <script src="js/webflow.js" type="text/javascript"></script>
</body>
</html>