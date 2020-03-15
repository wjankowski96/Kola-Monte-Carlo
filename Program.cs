using System;

namespace wstep
{
    class Program
    {
        static void Main(string[] args)
        {
            
            double pole, polekw, x, y; //pole koła, pole kwadratu, wsp x, wsp y
            int r, p, k; // promien, liczba probek, k
            Console.WriteLine("Podaj promień koła");
            r = int.Parse(Console.ReadLine());
            Console.WriteLine("Promień koła: {0}", r.ToString());
            Console.WriteLine("Podaj liczbę probek");
            p = int.Parse(Console.ReadLine());
            Console.WriteLine("Liczba próbek: {0}", p.ToString());

            pole = Math.PI * r * r;
            Console.WriteLine("Pole koła obliczone analitycznie: {0}", pole.ToString("0.00"));
            
            polekw = 4 * r * r;
            Random a = new Random();
            k = 0;
            for (int i = 1; i < p + 1; i++)
            {
                x = a.Next(-r, r) + a.NextDouble();
                y = a.Next(-r, r) + a.NextDouble();
                if ((x * x + y * y) <= r * r)
                {
                    k++;
                }
            }
            pole = polekw * k / p;
            Console.WriteLine("Pole koła obliczone numerycznie: {0}", pole.ToString("0.00"));


        }
    }
}
