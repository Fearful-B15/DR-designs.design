<?php
/**
 * The base configuration for WordPress
 *
 * The wp-config.php creation script uses this file during the installation.
 * You don't have to use the website, you can copy this file to "wp-config.php"
 * and fill in the values.
 *
 * This file contains the following configurations:
 *
 * * Database settings
 * * Secret keys
 * * Database table prefix
 * * ABSPATH
 *
 * @link https://developer.wordpress.org/advanced-administration/wordpress/wp-config/
 *
 * @package WordPress
 */

// ** Database settings - You can get this info from your web host ** //
/** The name of the database for WordPress */
define( 'DB_NAME', 'wordpress_db' );

/** Database username */
define( 'DB_USER', 'root' );

/** Database password */
define( 'DB_PASSWORD', '' );

/** Database hostname */
define( 'DB_HOST', 'localhost' );

/** Database charset to use in creating database tables. */
define( 'DB_CHARSET', 'utf8mb4' );

/** The database collate type. Don't change this if in doubt. */
define( 'DB_COLLATE', '' );

/**#@+
 * Authentication unique keys and salts.
 *
 * Change these to different unique phrases! You can generate these using
 * the {@link https://api.wordpress.org/secret-key/1.1/salt/ WordPress.org secret-key service}.
 *
 * You can change these at any point in time to invalidate all existing cookies.
 * This will force all users to have to log in again.
 *
 * @since 2.6.0
 */
define( 'AUTH_KEY',         'Js)N-qH)H.-Ht1f^Eu@_L+A[B3%9HHcA#V51a(+o<;s3Dc)qDll(8SE}le%2}Z/j' );
define( 'SECURE_AUTH_KEY',  'dK7gtKpKlNJbipmm-vPf;AA;xuuw`-9{0l5ARn/V:8VY~R@)SGk`X:8U.A~abct}' );
define( 'LOGGED_IN_KEY',    'dbOp/5wt5s!puhpj}H.B<:%m(Z;? dvRx48Sj3)zOFOA~|SN1CAZ[M,/#*R nQxy' );
define( 'NONCE_KEY',        'Ys=1M+_`AV5hwHc1M7>ax=sR8{55z#KdWkIzLq<=]Z~s?2]oiYV)Z&gZ(Xko@rMc' );
define( 'AUTH_SALT',        'Go,Gng6JKz@.6_&HbIZi&#)M`6:9$Q.9JC:e<}nQw^9aSlF>|VcK#%K-mF%VC7 g' );
define( 'SECURE_AUTH_SALT', '[S/dk6NY/LnHzJh8&ebo!;jX6uNwo&K*V$6%87j>uMN%l|eW`0bgFy9h)RTmA;Q!' );
define( 'LOGGED_IN_SALT',   'd *or.R8#O2XAUQi(}_auD]-DAwJ)_,(CH~Pu8ym1Rjo!}(2o3Vj?1C=Mkn~he{Q' );
define( 'NONCE_SALT',       'US`9[6(`9)Je#Kn-Ug:;7Zu7y~d@7592|DNS<0xQDwr?4mrSRU[_{`m%9{l1[(E,' );

/**#@-*/

/**
 * WordPress database table prefix.
 *
 * You can have multiple installations in one database if you give each
 * a unique prefix. Only numbers, letters, and underscores please!
 */
$table_prefix = 'wp_';

/**
 * For developers: WordPress debugging mode.
 *
 * Change this to true to enable the display of notices during development.
 * It is strongly recommended that plugin and theme developers use WP_DEBUG
 * in their development environments.
 *
 * For information on other constants that can be used for debugging,
 * visit the documentation.
 *
 * @link https://developer.wordpress.org/advanced-administration/debug/debug-wordpress/
 */
define( 'WP_DEBUG', false );

/* Add any custom values between this line and the "stop editing" line. */



/* That's all, stop editing! Happy publishing. */

/** Absolute path to the WordPress directory. */
if ( ! defined( 'ABSPATH' ) ) {
	define( 'ABSPATH', __DIR__ . '/' );
}

/** Sets up WordPress vars and included files. */
require_once ABSPATH . 'wp-settings.php';
