package com.jspiders.servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Netflix_Clone_servlet")
public class Netflix_Clone_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println("<html>\r\n"
				+ "  <head>\r\n"
				+ "    <meta name=\"description\" content=\"Hello this is my first web page!.\" />\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n"
				+ "    <link rel=\"stylesheet\" href=\"src/styles.css\" />\r\n"
				+ "\r\n"
				+ "    <style>\r\n"
				+ "        * {\r\n"
				+ "            margin: 0;\r\n"
				+ "            padding: 0;\r\n"
				+ "            box-sizing: border-box;\r\n"
				+ "          }\r\n"
				+ "          \r\n"
				+ "          body {\r\n"
				+ "            background-color: black;\r\n"
				+ "            color: white;\r\n"
				+ "            font-family: \"Poppins\", sans-serif;\r\n"
				+ "          }\r\n"
				+ "          \r\n"
				+ "          .navbar {\r\n"
				+ "            position: absolute;\r\n"
				+ "            top: 0;\r\n"
				+ "            width: 100%;\r\n"
				+ "            display: flex;\r\n"
				+ "            justify-content: space-between;\r\n"
				+ "            padding: 3% 5%;\r\n"
				+ "            z-index: 10;\r\n"
				+ "          }\r\n"
				+ "          \r\n"
				+ "          .navbar__brand {\r\n"
				+ "            width: 100px;\r\n"
				+ "            height: 100%;\r\n"
				+ "          }\r\n"
				+ "          \r\n"
				+ "          .brand__logo {\r\n"
				+ "            width: 150%;\r\n"
				+ "            height: 150%;\r\n"
				+ "          }\r\n"
				+ "          \r\n"
				+ "          .language_drop_down {\r\n"
				+ "            background: transparent;\r\n"
				+ "            border: none;\r\n"
				+ "            color: white;\r\n"
				+ "          }\r\n"
				+ "          \r\n"
				+ "          .language_drop_down:focus {\r\n"
				+ "            outline: none;\r\n"
				+ "          }\r\n"
				+ "          \r\n"
				+ "          .dropdown__container {\r\n"
				+ "            border: 1px solid white;\r\n"
				+ "            padding: 0.4rem;\r\n"
				+ "            border-radius: 4px;\r\n"
				+ "            background: rgba(0, 0, 0, 0.4);\r\n"
				+ "            \r\n"
				+ "          }\r\n"
				+ "          \r\n"
				+ "          .signin__button {\r\n"
				+ "            background-color: #dc030f;\r\n"
				+ "            border: 1px solid #dc030f;\r\n"
				+ "            color: white;\r\n"
				+ "            padding: 0.25rem 0.5rem;\r\n"
				+ "            border-radius: 4px;\r\n"
				+ "          }\r\n"
				+ "          \r\n"
				+ "          .navbar_nav_items {\r\n"
				+ "            display: flex;\r\n"
				+ "            gap: 10px;\r\n"
				+ "          }\r\n"
				+ "          \r\n"
				+ "          \r\n"
				+ "          \r\n"
				+ "          .hero_bg_image {\r\n"
				+ "            width: 100%;\r\n"
				+ "            height: 100%;\r\n"
				+ "            object-fit: cover;\r\n"
				+ "          }\r\n"
				+ "          \r\n"
				+ "          .hero_bg_overlay {\r\n"
				+ "            position: absolute;\r\n"
				+ "            inset: 0;\r\n"
				+ "            width: 100%;\r\n"
				+ "            height: 80vh;\r\n"
				+ "            background: rgba(0, 0, 0, 0.4);\r\n"
				+ "            background-image: linear-gradient(\r\n"
				+ "              to top,\r\n"
				+ "              rgba(0, 0, 0, 0.8) 0,\r\n"
				+ "              rgba(0, 0, 0, 0) 60%,\r\n"
				+ "              rgba(0, 0, 0, 0.8) 100%\r\n"
				+ "            );\r\n"
				+ "          }\r\n"
				+ "          \r\n"
				+ "          .hero__card {\r\n"
				+ "            position: absolute;\r\n"
				+ "            top: 20%;\r\n"
				+ "            text-align: center;\r\n"
				+ "            display: flex;\r\n"
				+ "            flex-direction: column;\r\n"
				+ "            gap: 10px;\r\n"
				+ "          }\r\n"
				+ "          \r\n"
				+ "         \r\n"
				+ "          \r\n"
				+ "          \r\n"
				+ "          \r\n"
				+ "          .hero__description {\r\n"
				+ "            margin: 0 50px;\r\n"
				+ "          }\r\n"
				+ "          \r\n"
				+ "          .email__input {\r\n"
				+ "            border: none;\r\n"
				+ "            background: transparent;\r\n"
				+ "            width: 100%;\r\n"
				+ "            height: 100%;\r\n"
				+ "            padding-left: 7px;\r\n"
				+ "          }\r\n"
				+ "          .email__label {\r\n"
				+ "            color: black;\r\n"
				+ "            position: absolute;\r\n"
				+ "            top: 28%;\r\n"
				+ "            left: 2%;\r\n"
				+ "            color: rgb(153, 149, 149);\r\n"
				+ "            transition: 0.5s;\r\n"
				+ "          }\r\n"
				+ "          \r\n"
				+ "          .email_form_container {\r\n"
				+ "            display: flex;\r\n"
				+ "            flex-direction: column;\r\n"
				+ "            justify-content: center;\r\n"
				+ "            align-items: center;\r\n"
				+ "            gap: 15px;\r\n"
				+ "          }\r\n"
				+ "          \r\n"
				+ "          .form__container {\r\n"
				+ "            background-color: white;\r\n"
				+ "            width: 90%;\r\n"
				+ "            height: 50px;\r\n"
				+ "            position: relative;\r\n"
				+ "          }\r\n"
				+ "          \r\n"
				+ "          .email_input:focus + .email_label {\r\n"
				+ "            top: 0.2rem;\r\n"
				+ "            font-size: 10px;\r\n"
				+ "          }\r\n"
				+ "          \r\n"
				+ "        \r\n"
				+ "          \r\n"
				+ "          .email__input:focus-visible {\r\n"
				+ "            outline: none;\r\n"
				+ "          }\r\n"
				+ "          \r\n"
				+ "          .primary__button {\r\n"
				+ "            background-color: #dc030f;\r\n"
				+ "            border: 1px solid #dc030f;\r\n"
				+ "            color: white;\r\n"
				+ "            padding: 0.8rem 1.2rem;\r\n"
				+ "            border-radius: 2px;\r\n"
				+ "            font-size: 15px;\r\n"
				+ "            letter-spacing: 1px;\r\n"
				+ "          }\r\n"
				+ "          \r\n"
				+ "          \r\n"
				+ "         \r\n"
				+ "          \r\n"
				+ "          @media (min-width: 768px) {\r\n"
				+ "            .hero_bgimage_container {\r\n"
				+ "              height: 100vh;\r\n"
				+ "            }\r\n"
				+ "          \r\n"
				+ "            .hero_bg_overlay {\r\n"
				+ "              height: 100vh;\r\n"
				+ "            }\r\n"
				+ "            \r\n"
				+ "            .hero__title {\r\n"
				+ "              font-size: 3rem;\r\n"
				+ "            }\r\n"
				+ "            .hero__subtitle,\r\n"
				+ "            .hero__description {\r\n"
				+ "              font-size: 1.3rem;\r\n"
				+ "            }\r\n"
				+ "          \r\n"
				+ "         \r\n"
				+ "          \r\n"
				+ "          }\r\n"
				+ "          \r\n"
				+ "\r\n"
				+ "          \r\n"
				+ "          @media (min-width: 1024px) {\r\n"
				+ "            .navbar {\r\n"
				+ "              padding: 2% 5%;\r\n"
				+ "            }\r\n"
				+ "          \r\n"
				+ "            \r\n"
				+ "          \r\n"
				+ "            .signin__button {\r\n"
				+ "              padding: 10px 20px;\r\n"
				+ "              font-size: 18px;\r\n"
				+ "            }\r\n"
				+ "            .dropdown__container {\r\n"
				+ "              padding: 10px 5px;\r\n"
				+ "            }\r\n"
				+ "          \r\n"
				+ "            .navbar_nav_items {\r\n"
				+ "              gap: 30px;\r\n"
				+ "            }\r\n"
				+ "          \r\n"
				+ "            .hero__card {\r\n"
				+ "              top: 50%;\r\n"
				+ "              left: 50%;\r\n"
				+ "              transform: translate(-50%, -50%);\r\n"
				+ "            }\r\n"
				+ "          \r\n"
				+ "            .form__container {\r\n"
				+ "              width: 50%;\r\n"
				+ "            }\r\n"
				+ "            .email_form_container {\r\n"
				+ "              flex-direction: row;\r\n"
				+ "              align-items: center;\r\n"
				+ "              gap: 1px;\r\n"
				+ "            }\r\n"
				+ "            .primary__button {\r\n"
				+ "              height: 50px;\r\n"
				+ "            }\r\n"
				+ "          \r\n"
				+ "          }\r\n"
				+ "          \r\n"
				+ "         \r\n"
				+ "    </style>\r\n"
				+ "    <link\r\n"
				+ "      rel=\"stylesheet\"\r\n"
				+ "      href=\"https://pro.fontawesome.com/releases/v5.10.0/css/all.css\"\r\n"
				+ "      integrity=\"sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p\"\r\n"
				+ "      crossorigin=\"anonymous\"\r\n"
				+ "    />\r\n"
				+ "    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\" />\r\n"
				+ "    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin />\r\n"
				+ "    <link\r\n"
				+ "      href=\"https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap\"\r\n"
				+ "      rel=\"stylesheet\"\r\n"
				+ "    />\r\n"
				+ "    <title>Netflix India - Watch TV Shows Online, Watch Movies Online</title>\r\n"
				+ "    <link rel=\"icon\" href=\"http://pngimg.com/uploads/netflix/small/netflix_PNG15.png\">\r\n"
				+ "  </head>\r\n"
				+ "  <body>\r\n"
				+ "    <header>\r\n"
				+ "      <nav class=\"navbar\">\r\n"
				+ "        <div class=\"navbar__brand\">\r\n"
				+ "          <img\r\n"
				+ "            src=\"https://www.freepnglogos.com/uploads/netflix-logo-0.png\"\r\n"
				+ "            alt=\"logo\"\r\n"
				+ "            class=\"brand__logo\"\r\n"
				+ "          />\r\n"
				+ "        </div>\r\n"
				+ "\r\n"
				+ "        <div class=\"navbar_nav_items\">\r\n"
				+ "          <div class=\"nav__item\">\r\n"
				+ "            <div class=\"dropdown__container\">\r\n"
				+ "              <i class=\"fas fa-globe\"></i>\r\n"
				+ "              <select\r\n"
				+ "                name=\"languages\"\r\n"
				+ "                id=\"languagesSelect\"\r\n"
				+ "                class=\"language_drop_down\"\r\n"
				+ "              >\r\n"
				+ "                <option value=\"english\" selected>English</option>\r\n"
				+ "                <option value=\"hindi\">हिन्दी</option>\r\n"
				+ "              </select>\r\n"
				+ "            </div>\r\n"
				+ "          </div>\r\n"
				+ "\r\n"
				+ "          <div class=\"nav__item\">\r\n"
				+ "            <button class=\"signin__button\">Sign in</button>\r\n"
				+ "          </div>\r\n"
				+ "        </div>\r\n"
				+ "      </nav>\r\n"
				+ "    </header>\r\n"
				+ "\r\n"
				+ "    <main>\r\n"
				+ "      <section class=\"hero\">\r\n"
				+ "        <div class=\"hero_bgimage_container\">\r\n"
				+ "          <img\r\n"
				+ "            src=\"https://assets.nflxext.com/ffe/siteui/vlv3/9c5457b8-9ab0-4a04-9fc1-e608d5670f1a/710d74e0-7158-408e-8d9b-23c219dee5df/IN-en-20210719-popsignuptwoweeks-perspective_alpha_website_small.jpg\"\r\n"
				+ "            alt=\"BG hero image\"\r\n"
				+ "            class=\"hero_bg_image\"\r\n"
				+ "          />\r\n"
				+ "        </div>\r\n"
				+ "        <div class=\"hero_bg_overlay\"></div>\r\n"
				+ "\r\n"
				+ "        <div class=\"hero__card\">\r\n"
				+ "          <h1 class=\"hero__title\">\r\n"
				+ "            Unlimited Movies TV,<br />\r\n"
				+ "            Shows and More.\r\n"
				+ "          </h1>\r\n"
				+ "          <p class=\"hero__subtitle\">Watch anywhere and cancel anytime.</p>\r\n"
				+ "          <p class=\"hero__description\">\r\n"
				+ "            Ready to watch? Enter your email to create or restart your\r\n"
				+ "            membership .\r\n"
				+ "          </p>\r\n"
				+ "\r\n"
				+ "          <div class=\"email_form_container\">\r\n"
				+ "            <div class=\"form__container\">\r\n"
				+ "              <input type=\"email\" class=\"email__input\" placeholder=\" \" />\r\n"
				+ "              <label class=\"email__label\">Email Address</label>\r\n"
				+ "            </div>\r\n"
				+ "            <button class=\"primary__button\">\r\n"
				+ "              Get Started <i class=\"fal fa-chevron-right\"></i>\r\n"
				+ "            </button>\r\n"
				+ "          </div>\r\n"
				+ "        </div>\r\n"
				+ "      </section>\r\n"
				+ "      \r\n"
				+ "  </body>\r\n"
				+ "</html>");
		
	}

}