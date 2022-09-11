package org.signature;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/upload")
public class Upload extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletFileUpload fileUpload = new ServletFileUpload(new DiskFileItemFactory());
        try {
            List<FileItem> files = fileUpload.parseRequest(req);
            for (FileItem file : files) {
                file.write(new File("C:\\Users\\surya\\IdeaProjects\\LoginSystem\\" + file.getName()));
            }
            resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();
            out.println("<html><body>");
            out.println("<h1> File upload completed! </h1>");
            out.println("</body></html>");
        } catch (Exception e) {
            e.printStackTrace();
            resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();
            out.println("<html><body>");
            out.println("<h1> Failed to upload files! </h1>");
            out.println("<h4>" + e + "</h4>");
            out.println("</body></html>");
        }
    }
}
