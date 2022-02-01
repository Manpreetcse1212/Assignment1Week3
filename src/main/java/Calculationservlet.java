import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * This servlet is used to calculate average, minimum, maximum and grades of students
 */
@WebServlet("/Calculationservlet")
public class Calculationservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculationservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int m1=Integer.parseInt(request.getParameter("m1"));
		int m2=Integer.parseInt(request.getParameter("m2"));
		int m3=Integer.parseInt(request.getParameter("m3"));
		int m4=Integer.parseInt(request.getParameter("m4"));
		int m5=Integer.parseInt(request.getParameter("m5"));
		
		String name=request.getParameter("studentname");

		int total=m1+m2+m3+m4+m5; 

		int avg=total/5;
		
		int min, max;
		
		int ar[]=new int[5];
		ar[0]=m1;
		ar[1]=m2;
		ar[2]=m3;
		ar[3]=m4;
		ar[4]=m5;
		min=m1;
		
		for(int i=0;i<5;i++) // Finding maximum and minimum marks
		{
			if(min>ar[i])
			{
				min=ar[i];
			}
		}
		
		max=m1;
		for(int i=0;i<5;i++)
		{
			if(max<ar[i])
			{
				max=ar[i];
			}
		}

		String grade;

		if(avg>90) // Calculating Grades
		{
		grade="A+";
		}
		else if(avg>80 && avg<=90)
		{
			grade="A";
		}
		else if(avg>70 && avg<=80)
		{
			grade="B+";
		}
		else if(avg>60 && avg<=70)
		{
			grade="B";
		}
		else if(avg>50 && avg<=60)
		{
			grade="C";
		}
		else
		{
			grade="D";
		}
		
			
		HttpSession hb=request.getSession();
		hb.setAttribute("name", name);
		hb.setAttribute("grade", grade);
		hb.setAttribute("m1", m1);
		hb.setAttribute("m2", m2);
		hb.setAttribute("m3", m3);
		hb.setAttribute("m4", m4);
		hb.setAttribute("m5", m5);
		hb.setAttribute("max", max);
		hb.setAttribute("min", min);
		
		response.sendRedirect("final.jsp"); // Navigating to final.jsp
		
		doGet(request, response);
	}

}
