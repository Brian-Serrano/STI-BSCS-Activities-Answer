using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04_Task_Performance_1
{
    internal class Program
    {
        private static Random random;

        static void Main(string[] args)
        {
            random = new Random();
            LoadWords(0, 0);
        }

        private static void LoadWords(int score, int items)
        {
            if(items == 10)
            {
                Console.WriteLine("Congratulations, your score is " + score);
                Console.ReadLine();
            }
            else
            {
                string word = GetWords()[random.Next(0, GetWords().Count)].ToString();
                StringBuilder sb = new StringBuilder(word);

                int lettersToHide = sb.Length > 5 ? 4 : 3;

                for(int i = 0; i < lettersToHide; i++)
                {
                    HideLetters(sb);
                }

                Console.WriteLine("Guess the word: " + sb.ToString());
                string answer = Console.ReadLine();
                if(answer.ToLower() == word)
                {
                    Console.WriteLine("Correct");
                    score++;
                }
                else
                {
                    Console.WriteLine("Wrong. Correct answer is " + word);
                }

                LoadWords(score, items + 1);
            }
        }

        private static void HideLetters(StringBuilder sb)
        {
            int randomLetter = random.Next(0, sb.Length);
            if (sb[randomLetter] == '#')
            {
                HideLetters(sb);
            }
            else
            {
                sb[randomLetter] = '#';
            }
        }

        private static ArrayList GetWords()
        {
            return new ArrayList() {
                "apple",
                "orange",
                "banana",
                "peach",
                "grape",
                "lemon",
                "lime",
                "mango",
                "kiwi",
                "cherry",
                "berry",
                "melon",
                "pear",
                "plum",
                "apricot",
                "papaya",
                "avocado",
                "coconut",
                "tomato",
                "potato",
                "carrot",
                "onion",
                "celery",
                "pepper",
                "cabbage",
                "lettuce",
                "spinach",
                "broccoli",
                "zucchini",
                "garlic"
            };
        }
    }
}
