
//--------------------------------
//	Hello.java
//--------------------------------
//　自分が格納されているフォルダ名
package servlet;

//自分が格納されているフォルダの外にある必要なクラス
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
	//HttpServletを継承することで、このクラスはServletとして、働くことができる
	public class Hello extends HttpServlet{	
	
	/**
	* 
	*/
		private static final long serialVersionUID = 1L;

	//  doGetメソッドは使わないので、doPostメソッドへ転送
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		doPost(request, response);
	}

	//  requestオブジェクトには、フォームで入力された文字列などが格納されている。
	//  responseオブジェクトを使って、次のページを表示する
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException{	

		// requestオブジェクトの文字エンコーディングの設定
		request.setCharacterEncoding("UTF-8");
		
		// requestオブジェクトから登録情報の取り出し
		String hello = request.getParameter("hello");
		System.out.println("取得した文字列は"+hello+"です！");
		}
	}
