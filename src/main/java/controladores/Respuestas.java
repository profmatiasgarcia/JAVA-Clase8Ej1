/**
 * @author Prof Matias Garcia.
 * <p> Copyright (C) 2026 para <a href = "https://www.profmatiasgarcia.com.ar/"> www.profmatiasgarcia.com.ar </a>
 * - con licencia GNU GPL3.
 * <p> Este programa es software libre. Puede redistribuirlo y/o modificarlo bajo los términos de la
 * Licencia Pública General de GNU según es publicada por la Free Software Foundation, 
 * bien con la versión 3 de dicha Licencia o bien (según su elección) con cualquier versión posterior. 
 * Este programa se distribuye con la esperanza de que sea útil, pero SIN NINGUNA GARANTÍA, 
 * incluso sin la garantía MERCANTIL implícita o sin garantizar la CONVENIENCIA PARA UN PROPÓSITO
 * PARTICULAR. Véase la Licencia Pública General de GNU para más detalles.
 * Debería haber recibido una copia de la Licencia Pública General junto con este programa. 
 * Si no ha sido así ingrese a <a href = "http://www.gnu.org/licenses/"> GNU org </a>
 **/
package controladores;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "Respuestas", urlPatterns = {"/Respuestas"})
public class Respuestas extends HttpServlet {

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
            out.print("<html><head>");
            out.print("<title>Viendo una petición HTTP</title>");
            out.print("</head><body>");
            out.print("<p><strong>getProtocol</strong>: " + request.getProtocol() + "</p>");
            out.print("<p><strong>getMethod</strong>: " + request.getMethod() + "</p>");
            out.print("<p><strong>getScheme</strong>: " + request.getScheme() + "</p>");
            out.print("<hr>");
            out.print("<p><strong>getServerName</strong>: " + request.getServerName() + "</p>");
            out.print("<p><strong>getServerPort</strong>: " + request.getServerPort() + "</p>");
            out.print("<hr>");
            out.print("<p><strong>getRemoteAddr</strong>: " + request.getRemoteAddr() + "</p>");
            out.print("<p><strong>getRemoteHost</strong>: " + request.getRemoteHost() + "</p>");
            out.print("<p><strong>getRemotePort</strong>: " + request.getRemotePort() + "</p>");
            out.print("<hr>");
            out.print("<p><strong>getRequestURL</strong>: " + request.getRequestURL() + "</p>");
            out.print("<p><strong>getRequestURI</strong>: " + request.getRequestURI() + "</p>");
            out.print("<p><strong>getContextPath</strong>: " + request.getContextPath() + "</p>");
            out.print("<p><strong>getServletPath</strong>: " + request.getServletPath() + "</p>");
            out.print("<p><strong>getPathInfo</strong>: " + request.getPathInfo() + "</p>");
            out.print("<p><strong>getQueryString:</strong> " + request.getQueryString() + "</p>");
            out.print("</body></html>");
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
