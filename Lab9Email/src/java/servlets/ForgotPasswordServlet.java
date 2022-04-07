package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import services.AccountService;

/**
 *
 * @author Madhu
 */
public class ForgotPasswordServlet extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/forgot.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String email = request.getParameter("email");
        //if (email == null || email.isEmpty()){
            //request.setAttribute("message", "Please enter your email id.");
        //} else {
            
            //AccountService service = new AccountService();
            String path = getServletContext().getRealPath("/WEB-INF");
            
           AccountService.forgotPassword(email, path);
           
           HttpSession session = request.getSession();
           session.setAttribute("message", "If the address you entered is valid, you will receive an email very soon. Please check your email for your password.");
           
           getServletContext().getRequestDispatcher("/WEB-INF/forgot.jsp").forward(request, response);
           
        }
        
        
    }
   

