import java.util.*;
class App
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		
		System.out.println("\t Welcome to Tomato "+(char)1+" Are you Hunger");
		System.out.println("Select the Hotel");
		System.out.println("1.SS Hyderabad\n2.Al-Safa\n3.Buhar\n4.Eats-of-Arab");
		int n=s.nextInt();
		switch(n)
		{
			case 1:
			{
				System.out.println("\tThank you for selecting SS Hyderabad");
				System.out.println("...............Please select your food...................");
				System.out.println("1.Chicken Biriyani\n2.Mutton Biriyani\n3.Chicken 65");
				int f=s.nextInt();
				switch(f)
				{
					case 1:
					{
						System.out.println("\t Please select Quatity");
						int Qty=s.nextInt();
						int price=100;
						int total=Qty*price;
						System.out.println(".............Processing....................");
						Thread.sleep(1000);
						System.out.println("Your Total Bill "+total);
						Thread.sleep(2000);
						System.out.println("\t Select Payment mode");
						System.out.println("1.Google Pay\n2.Phonepe\n3.Paytm");
						int p=s.nextInt();
						switch(p)
						{
							case 1:
							{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
							break;
							case 2:
								{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
							break;
							case 3:
								{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
						}
						
						


					}
					break;
					
					
					case 2:
						{
						System.out.println("\t Please select Quatity");
						int Qty=s.nextInt();
						int price=180;
						int total=Qty*price;
						System.out.println(".............Processing....................");
						Thread.sleep(1000);
						System.out.println("Your Total Bill "+total);
						Thread.sleep(2000);
						System.out.println("\t Select Payment mode");
						System.out.println("1.Google Pay\n2.Phonepe\n3.Paytm");
						int p=s.nextInt();
						switch(p)
						{
							case 1:
							{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
							break;
							case 2:
								{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
							break;
							case 3:
								{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
							
						}


					}
					break;
	
					case 3:
						{
						System.out.println("\t Please select Quatity");
						int Qty=s.nextInt();
						int price=150;
						int total=Qty*price;
						System.out.println(".............Processing....................");
						Thread.sleep(1000);
						System.out.println("Your Total Bill "+total);
						Thread.sleep(2000);
						System.out.println("\t Select Payment mode");
						System.out.println("1.Google Pay\n2.Phonepe\n3.Paytm");
						int p=s.nextInt();
						switch(p)
						{
							case 1:
							{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
							break;
							case 2:
								{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
							break;
							case 3:
								{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
						}


					}
						
				}
			}
			break;

			case 2:
				{
				System.out.println("\tThank you for selecting Al-Safa");
				System.out.println("...............Please select your food...................");
				System.out.println("1.Chicken Biriyani\n2.Mutton Biriyani\n3.Chicken 65");
				int f=s.nextInt();
				switch(f)
				{
					case 1:
						{
						System.out.println("\t Please select Quatity");
						int Qty=s.nextInt();
						int price=100;
						int total=Qty*price;
						System.out.println(".............Processing....................");
						Thread.sleep(1000);
						System.out.println("Your Total Bill "+total);
						Thread.sleep(2000);
						System.out.println("\t Select Payment mode");
						System.out.println("1.Google Pay\n2.Phonepe\n3.Paytm");
						int p=s.nextInt();
						switch(p)
						{
							case 1:
							{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
							break;
							case 2:
								{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
							break;
							case 3:
								{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
						}


					}
					break;
					case 2:
						{
						System.out.println("\t Please select Quatity");
						int Qty=s.nextInt();
						int price=180;
						int total=Qty*price;
						System.out.println(".............Processing....................");
						Thread.sleep(1000);
						System.out.println("Your Total Bill "+total);
						Thread.sleep(2000);
						System.out.println("\t Select Payment mode");
						System.out.println("1.Google Pay\n2.Phonepe\n3.Paytm");
						int p=s.nextInt();
						switch(p)
						{
							case 1:
							{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
							break;
							case 2:
								{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
							break;
							case 3:
								{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
						}


					}
					break;
					case 3:
						{
						System.out.println("\t Please select Quatity");
						int Qty=s.nextInt();
						int price=150;
						int total=Qty*price;
						System.out.println(".............Processing....................");
						Thread.sleep(1000);
						System.out.println("Your Total Bill "+total);
						Thread.sleep(2000);
						System.out.println("\t Select Payment mode");
						System.out.println("1.Google Pay\n2.Phonepe\n3.Paytm");
						int p=s.nextInt();
						switch(p)
						{
							case 1:
							{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
							break;
							case 2:
								{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
							break;
							case 3:
								{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
						}


					}
						
				}
			}
			break;
			case 3:
				{
				System.out.println("\tThank you for selecting Buhar");
				System.out.println("...............Please select your food...................");
				System.out.println("1.Chicken Biriyani\n2.Mutton Biriyani\n3.Chicken 65");
				int f=s.nextInt();
				switch(f)
				{
					case 1:
						{
						System.out.println("\t Please select Quatity");
						int Qty=s.nextInt();
						int price=100;
						int total=Qty*price;
						System.out.println(".............Processing....................");
						Thread.sleep(1000);
						System.out.println("Your Total Bill "+total);
						Thread.sleep(2000);
						System.out.println("\t Select Payment mode");
						System.out.println("1.Google Pay\n2.Phonepe\n3.Paytm");
						int p=s.nextInt();
						switch(p)
						{
							case 1:
							{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
							break;
							case 2:
								{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
							}
							break;
							case 3:
								{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
						}


					}
					break;
					case 2:
						{
						System.out.println("\t Please select Quatity");
						int Qty=s.nextInt();
						int price=180;
						int total=Qty*price;
						System.out.println(".............Processing....................");
						Thread.sleep(1000);
						System.out.println("Your Total Bill "+total);
						Thread.sleep(2000);
						System.out.println("\t Select Payment mode");
						System.out.println("1.Google Pay\n2.Phonepe\n3.Paytm");
						int p=s.nextInt();
						switch(p)
						{
							case 1:
							{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
							break;
							case 2:
								{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
							break;
							case 3:
								{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
						}


					}
					break;
					case 3:
						{
						System.out.println("\t Please select Quatity");
						int Qty=s.nextInt();
						int price=150;
						int total=Qty*price;
						System.out.println(".............Processing....................");
						Thread.sleep(1000);
						System.out.println("Your Total Bill "+total);
						Thread.sleep(2000);
						System.out.println("\t Select Payment mode");
						System.out.println("1.Google Pay\n2.Phonepe\n3.Paytm");
						int p=s.nextInt();
						switch(p)
						{
							case 1:
							{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
							break;
							case 2:
								{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
							break;
							case 3:
								{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
						}


					}
						
				}
			}
			break;
			case 4:
				{
				System.out.println("\tThank you for selecting Eats-of-Arab");
				System.out.println("...............Please select your food...................");
				System.out.println("1.Chicken Biriyani\n2.Mutton Biriyani\n3.Chicken 65");
				int f=s.nextInt();
				switch(f)
				{
					case 1:
					{
						System.out.println("\t Please select Quatity");
						int Qty=s.nextInt();
						int price=100;
						int total=Qty*price;
						System.out.println(".............Processing....................");
						Thread.sleep(1000);
						System.out.println("Your Total Bill "+total);
						Thread.sleep(2000);
						System.out.println("\t Select Payment mode");
						System.out.println("1.Google Pay\n2.Phonepe\n3.Paytm");
						int p=s.nextInt();
						switch(p)
						{
							case 1:
							{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
							break;
							case 2:
								{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
							break;
							case 3:
								{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
						}


					}
					break;
					case 2:
						{
						System.out.println("\t Please select Quatity");
						int Qty=s.nextInt();
						int price=180;
						int total=Qty*price;
						System.out.println(".............Processing....................");
						Thread.sleep(1000);
						System.out.println("Your Total Bill "+total);
						Thread.sleep(2000);
						System.out.println("\t Select Payment mode");
						System.out.println("1.Google Pay\n2.Phonepe\n3.Paytm");
						int p=s.nextInt();
						switch(p)
						{
							case 1:
							{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
							break;
							case 2:
								{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
							break;
							case 3:
								{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
						}


					}
					break;
					case 3:
						{
						System.out.println("\t Please select Quatity");
						int Qty=s.nextInt();
						int price=150;
						int total=Qty*price;
						System.out.println(".............Processing....................");
						Thread.sleep(1000);
						System.out.println("Your Total Bill "+total);
						Thread.sleep(2000);
						System.out.println("\t Select Payment mode");
						System.out.println("1.Google Pay\n2.Phonepe\n3.Paytm");
						int p=s.nextInt();
						switch(p)
						{
							case 1:
							{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
							break;
							case 2:
								{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
							break;
							case 3:
								{
								System.out.println("Please Enter the Amount "+total);
								int ent_amt=s.nextInt();
								if(ent_amt==total)
								{
									System.out.println("Enter Otp");
									Thread.sleep(2000);
									double d=(Math.random()*9999)+9999;
									int otp=(int)d;
									System.out.println(otp);
									int enter_otp=s.nextInt();
									String A1=(otp==enter_otp)?"Order Accepted":"Verification Failed";
									System.out.println("..............Processing...............");
									Thread.sleep(3000);
									System.out.println(A1);
									Thread.sleep(3000);
									System.out.println("Thank you order again "+(char)1);
									
								}
								else
									System.out.println("Please Enter correct Bill Amount");
							}
						}


					}
						
				}
			}
			break;
			default:
			{
				System.out.println("Invalid Number");
			}
		}
	}
}