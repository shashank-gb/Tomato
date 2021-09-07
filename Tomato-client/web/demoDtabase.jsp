<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
 
<html>
   <head>
      <title>SELECT Operation</title>
   </head>

   <body>
       <form action="" method="POST">
   <select name="location" id="loc_id" onchange="this.form.submit()">
   <option value="0">Select City</option>
   <%
        String dbname = "tomato";
        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/";
        
        Connection con = null;
        PreparedStatement ps= null;
        ResultSet rs = null;
        Statement st = null;
       try{
        
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url+dbname, username , password);
  
        st = con.createStatement();

        String query = "select l_id, city from location;";
        rs = st.executeQuery(query);
       
        while(rs.next()){
            System.out.println(rs.getString("city"));
            %>
            <option value="<%= rs.getInt("l_id")%>"
                    
                    <%
                        if(request.getParameter("location")!=null){
                            if(rs.getInt("l_id") == Integer.parseInt(request.getParameter("location"))){
                                out.print("selected");
                            }
                        }
                    %>
                    
                    ><%=rs.getString("city")+" - "+rs.getInt("l_id")%>
            
            </option>
            <%
        }
    }catch(Exception e){
        System.out.println(e);
    }
   %>
   </select>
   <select>
       <option value="0">Select Hotel</option>
       <%
           try{
               Class.forName("com.mysql.jdbc.Driver").newInstance();
               con = DriverManager.getConnection(url+dbname, username , password);

               st = con.createStatement();
               String query = "select * from restaurant where l_id = "+request.getParameter("location")+";";
               System.out.println(query);
               rs = st.executeQuery(query);
               
               while(rs.next()){
        %>
                  <option value="<%= rs.getInt("rid")%>"><%=rs.getString("rname")%></option>
        <%   
               }
           }catch(Exception e){

               System.out.println(e);

           }
        %>
   </select>
   </form>
   </body>
</html>