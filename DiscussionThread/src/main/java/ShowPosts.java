/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Felipe
 */
@WebServlet(urlPatterns = {"/ShowPosts"})
public class ShowPosts extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession();
            String user = (String) session.getAttribute("username");
            String newPost = request.getParameter("newPost");

            // create dummy posts for whoever is logged in
            List<SavedPosts> posts = new ArrayList<SavedPosts>();
            if (user.equals("Felipe")) {
                posts.add(new SavedPosts("Felipe was here!", new Date(2016, 7, 16)));
                posts.add(new SavedPosts("In the end, it's not the years in your life that count. It's the life in your years.", new Date(2016, 7, 17)));
                posts.add(new SavedPosts("Felipe is the coolest guy ever!", new Date(2016, 7, 17)));
            } else if (user.equals("Jacob")) {
                posts.add(new SavedPosts("Jacob was here!", new Date(2016, 7, 16)));
                posts.add(new SavedPosts("Only a life lived for others is a life worthwhile.", new Date(2016, 7, 17)));
                posts.add(new SavedPosts("Sometimes Jacob plays League of Legends", new Date(2016, 7, 17)));
            } else if (user.equals("Tad")) {
                posts.add(new SavedPosts("Tad was here!", new Date(2016, 7, 16)));
                posts.add(new SavedPosts("Tad loves to eat pizza", new Date(2016, 7, 17)));
                posts.add(new SavedPosts("Three days ago Tad caught a Pikachu", new Date(2016, 7, 17)));
            }

            if (newPost != null) {
                posts.add(new SavedPosts(newPost, new Date()));
            }
            
            Collections.reverse(posts);

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>" + user + "'s Posts</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" + user + "'s latest posts:</h1>");

            // display all the posts
            out.println("<ul>");
            for (SavedPosts post : posts) {
                out.println("<li>" + post.date.toString() + "</li>");
                out.println("<li>" + post.thePost + "</li>");
                out.println("</br>");
            }
            out.println("</ul>");

            out.println("<a href=\"NewPost.jsp\">Enter another post</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        processRequest(request, response);
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
