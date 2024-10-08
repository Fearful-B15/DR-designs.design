<?php
/**
 * Own Shope: Dynamic CSS stylesheet
 * 
 */


function own_shope_dynamic_css_stylesheet() {
    
    $layout= (OWN_SHOPE_CONTAINER_CLASS=='os-container') ? '1350px' : '1170px';
    $primary_color= sanitize_hex_color(get_theme_mod( 'own_shop_site_primary_color','#333333' ));
    $secondary_color= sanitize_hex_color(get_theme_mod( 'own_shop_site_secondary_color','#000000' ));

    $css = '

        .wp-block-cover.alignwide,
        .wp-block-columns.alignwide,
        .wc-block-grid__products,
        .wp-block-cover-image .wp-block-cover__inner-container, 
        .wp-block-cover .wp-block-cover__inner-container {
             padding: 0 15px;
        }

        h1, h2, h3, h4, h5, h6,
        .single h1.entry-title a {
            color: #000;
        }

        .top-menu .navigation >li.current-menu-item  a {
            color: '.$primary_color.';
        }

        footer#footer, footer#footer .footer-widgets-wrapper {
            clear: both;
        }

        .wp-block-button__link,
        .wc-block-grid__product-onsale,
        .wp-block-search .wp-block-search__button {
            background: '.$primary_color.' !important;
            color: #fff !important; 
            border: none;
        }

        a,
        article .meta-item a {
            text-decoration: underline;
        }

        header a,
        footer a,
        .single h1.entry-title a,
        .single .post-tags a,
        .post-navigation a, 
        .single ul.post-categories li a,
        .entry-title a,
        .read-more a,
        .blog aside li a,
        .hd-bar .side-menu ul li a {
            text-decoration: none;
        }

	';


    if(true===get_theme_mod( 'own_shope_enable_header_category_menu',false)) :
        $css .='
            @media only screen and (max-width: 991px) {
                .col-md-9.hidden-xs .top-menu-wrapper {
                    display: none;
                }
            }
        ';
    else:
        $css .='
            @media only screen and (max-width: 991px) {
                .col-md-12.hidden-xs .top-menu-wrapper {
                    display: none;
                }
            }
            
        ';
    endif;


    //CSS when layout width changes
    if('container'===esc_html(get_theme_mod('own_shop_layout_content_width_ratio','os-container'))) :
        $css .='
           @media only screen and (min-width: 1400px) and (max-width: 1921px) {
                header button[type=submit] i {
                    left: 465px;
                }
            }

            @media (max-width: 767px) {
                .has-blocks h1:not(h1.site-title):not(.blog h1):not(.single h1):not(.archive h1):not(.wp-block-cover__inner-container h1), 
                .has-blocks h2:not(.blog h2):not(.single h2):not(.archive h2):not(.wp-block-cover__inner-container h2), 
                .has-blocks h3:not(.blog h3):not(.single h3):not(.archive h3):not(.wp-block-cover__inner-container h3), 
                .has-blocks h4:not(.blog h4):not(.single h4):not(.archive h4):not(footer h4):not(.wp-block-cover__inner-container h4), 
                .has-blocks h5:not(.blog h5):not(.single h5):not(.archive h5):not(.wp-block-cover__inner-container h5), 
                .has-blocks h6:not(.blog h6):not(.single h6):not(.archive h6):not(.wp-block-cover__inner-container h6),
                .has-blocks p:not(blockquote p):not(.container p):not(p.site-title):not(p.site-description),
                .has-blocks blockquote,
                .has-blocks table,
                .has-blocks dl,
                .has-blocks ul:not(ul.header-woo-cart):not(ul.site-header-cart):not(ul.wishlist-icon-container-mobile):not(ul.breadcrumbs-wrapper),
                .has-blocks ol,
                .has-blocks address,
                .has-blocks pre,
                .has-blocks .wp-block-cover.alignwide,
                .has-blocks .wp-block-columns.alignwide,
                .has-blocks .wc-block-grid__products,
                .has-blocks .wp-block-cover-image .wp-block-cover__inner-container, 
                .has-blocks .wp-block-cover .wp-block-cover__inner-container {
                    padding-left: 15px;
                    padding-right: 15px;
                }

                .has-blocks figure.alignleft > p {
                    padding-left: 15px;
                    padding-right: 15px;
                }
            }

            @media (min-width: 768px) {
                .has-blocks h1:not(h1.site-title):not(.blog h1):not(.single h1):not(.archive h1):not(.wp-block-cover__inner-container h1), 
                .has-blocks h2:not(.blog h2):not(.single h2):not(.archive h2):not(.wp-block-cover__inner-container h2), 
                .has-blocks h3:not(.blog h3):not(.single h3):not(.archive h3):not(.wp-block-cover__inner-container h3), 
                .has-blocks h4:not(.blog h4):not(.single h4):not(.archive h4):not(footer h4):not(.wp-block-cover__inner-container h4), 
                .has-blocks h5:not(.blog h5):not(.single h5):not(.archive h5):not(.wp-block-cover__inner-container h5), 
                .has-blocks h6:not(.blog h6):not(.single h6):not(.archive h6):not(.wp-block-cover__inner-container h6),
                .has-blocks p:not(blockquote p):not(.container p):not(p.site-title):not(p.site-description),
                .has-blocks blockquote,
                .has-blocks table,
                .has-blocks dl,
                .has-blocks ul:not(ul.header-woo-cart):not(ul.site-header-cart):not(ul.wishlist-icon-container-mobile):not(ul.breadcrumbs-wrapper),
                .has-blocks ol,
                .has-blocks address,
                .has-blocks pre,
                .has-blocks .wp-block-cover.alignwide,
                .has-blocks .wp-block-columns.alignwide,
                .has-blocks .wc-block-grid__products,
                .has-blocks .wp-block-cover-image .wp-block-cover__inner-container, 
                .has-blocks .wp-block-cover .wp-block-cover__inner-container {
                    max-width: 750px;
                    margin: 0 auto;
                }

                .has-blocks figure.alignleft > p {
                    width: 750px;
                }
            }

            @media (min-width: 992px) {
                .has-blocks h1:not(h1.site-title):not(.blog h1):not(.single h1):not(.archive h1):not(.wp-block-cover__inner-container h1), 
                .has-blocks h2:not(.blog h2):not(.single h2):not(.archive h2):not(.wp-block-cover__inner-container h2), 
                .has-blocks h3:not(.blog h3):not(.single h3):not(.archive h3):not(.wp-block-cover__inner-container h3), 
                .has-blocks h4:not(.blog h4):not(.single h4):not(.archive h4):not(footer h4):not(.wp-block-cover__inner-container h4), 
                .has-blocks h5:not(.blog h5):not(.single h5):not(.archive h5):not(.wp-block-cover__inner-container h5), 
                .has-blocks h6:not(.blog h6):not(.single h6):not(.archive h6):not(.wp-block-cover__inner-container h6),
                .has-blocks p:not(blockquote p):not(.container p):not(p.site-title):not(p.site-description),
                .has-blocks blockquote,
                .has-blocks table,
                .has-blocks dl,
                .has-blocks ul:not(ul.header-woo-cart):not(ul.site-header-cart):not(ul.wishlist-icon-container-mobile):not(ul.breadcrumbs-wrapper),
                .has-blocks ol,
                .has-blocks address,
                .has-blocks pre,
                .has-blocks .wp-block-cover.alignwide,
                .has-blocks .wp-block-columns.alignwide,
                .has-blocks .wc-block-grid__products,
                .has-blocks .wp-block-cover-image .wp-block-cover__inner-container, 
                .has-blocks .wp-block-cover .wp-block-cover__inner-container {
                    max-width: 970px;
                    margin: 0 auto;
                }

                .has-blocks figure.alignleft > p {
                    width: 970px;
                }
            }

            @media (min-width: 1200px) {
                .has-blocks h1:not(h1.site-title):not(.blog h1):not(.single h1):not(.archive h1):not(.wp-block-cover__inner-container h1), 
                .has-blocks h2:not(.blog h2):not(.single h2):not(.archive h2):not(.wp-block-cover__inner-container h2), 
                .has-blocks h3:not(.blog h3):not(.single h3):not(.archive h3):not(.wp-block-cover__inner-container h3), 
                .has-blocks h4:not(.blog h4):not(.single h4):not(.archive h4):not(footer h4):not(.wp-block-cover__inner-container h4),
                .has-blocks h5:not(.blog h5):not(.single h5):not(.archive h5):not(.wp-block-cover__inner-container h5), 
                .has-blocks h6:not(.blog h6):not(.single h6):not(.archive h6):not(.wp-block-cover__inner-container h6),
                .has-blocks p:not(blockquote p):not(.container p):not(p.site-title):not(p.site-description),
                .has-blocks blockquote,
                .has-blocks table,
                .has-blocks dl,
                .has-blocks ul:not(ul.header-woo-cart):not(ul.site-header-cart):not(ul.wishlist-icon-container-mobile):not(ul.breadcrumbs-wrapper),
                .has-blocks ol,
                .has-blocks address,
                .has-blocks pre,
                .has-blocks .wp-block-cover.alignwide,
                .has-blocks .wp-block-columns.alignwide,
                .has-blocks .wc-block-grid__products,
                .has-blocks .wp-block-cover-image .wp-block-cover__inner-container, 
                .has-blocks .wp-block-cover .wp-block-cover__inner-container {
                    max-width: '.$layout.';
                    margin: 0 auto;
                }

                .has-blocks figure.alignleft > p {
                    width: '.$layout.';
                }
            }
        ';
    else:
        $css .='

             @media (min-width: 1200px) {
                .has-blocks h1:not(h1.site-title):not(.blog h1):not(.single h1):not(.archive h1):not(.wp-block-cover__inner-container h1), 
                .has-blocks h2:not(.blog h2):not(.single h2):not(.archive h2):not(.wp-block-cover__inner-container h2), 
                .has-blocks h3:not(.blog h3):not(.single h3):not(.archive h3):not(.wp-block-cover__inner-container h3), 
                .has-blocks h4:not(.blog h4):not(.single h4):not(.archive h4):not(footer h4):not(.wp-block-cover__inner-container h4),
                .has-blocks h5:not(.blog h5):not(.single h5):not(.archive h5):not(.wp-block-cover__inner-container h5), 
                .has-blocks h6:not(.blog h6):not(.single h6):not(.archive h6):not(.wp-block-cover__inner-container h6),
                .has-blocks p:not(blockquote p):not(.container p):not(p.site-title):not(p.site-description),
                .has-blocks blockquote,
                .has-blocks table,
                .has-blocks dl,
                .has-blocks ul:not(ul.header-woo-cart):not(ul.site-header-cart):not(ul.wishlist-icon-container-mobile):not(ul.breadcrumbs-wrapper),
                .has-blocks ol,
                .has-blocks address,
                .has-blocks pre,
                .has-blocks .wp-block-cover.alignwide,
                .has-blocks .wp-block-columns.alignwide,
                .has-blocks .wc-block-grid__products,
                .has-blocks .wp-block-cover-image .wp-block-cover__inner-container, 
                .has-blocks .wp-block-cover .wp-block-cover__inner-container {
                    max-width: '.$layout.';
                    margin: 0 auto;
                }

                .has-blocks figure.alignleft > p {
                    max-width: '.$layout.';
                    margin: 0 auto;
                }
            }

             @media (max-width: 1200px) {
                .has-blocks h1:not(h1.site-title):not(.blog h1):not(.single h1):not(.archive h1):not(.wp-block-cover__inner-container h1), 
                .has-blocks h2:not(.blog h2):not(.single h2):not(.archive h2):not(.wp-block-cover__inner-container h2), 
                .has-blocks h3:not(.blog h3):not(.single h3):not(.archive h3):not(.wp-block-cover__inner-container h3), 
                .has-blocks h4:not(.blog h4):not(.single h4):not(.archive h4):not(footer h4):not(.wp-block-cover__inner-container h4),
                .has-blocks h5:not(.blog h5):not(.single h5):not(.archive h5):not(.wp-block-cover__inner-container h5), 
                .has-blocks h6:not(.blog h6):not(.single h6):not(.archive h6):not(.wp-block-cover__inner-container h6),
                .has-blocks p:not(blockquote p):not(.container p):not(p.site-title):not(p.site-description),
                .has-blocks blockquote,
                .has-blocks table,
                .has-blocks dl,
                .has-blocks ul:not(ul.header-woo-cart):not(ul.site-header-cart):not(ul.wishlist-icon-container-mobile):not(ul.breadcrumbs-wrapper),
                .has-blocks ol,
                .has-blocks address,
                .has-blocks pre,
                .has-blocks .wp-block-cover.alignwide,
                .has-blocks .wp-block-columns.alignwide,
                .has-blocks .wc-block-grid__products,
                .has-blocks .wp-block-cover-image .wp-block-cover__inner-container, 
                .has-blocks .wp-block-cover .wp-block-cover__inner-container {
                    width: 99%;
                    padding-left: 15px;
                    padding-right: 15px;
                }

                .has-blocks figure.alignleft > p {
                    width: 99%;
                    padding-left: 15px;
                    padding-right: 15px;
                }
            }
        ';
    endif;
	
	return apply_filters( 'own_shope_dynamic_css_stylesheet', own_shope_minimize_css($css));
}