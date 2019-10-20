/*

Write a program that reads students’ names followed by their test scores.
 The program should output each student’s name followed by the test
  scores and the relevant grade. It should also find and print the highest
   test score and the name of the students having the highest test score.
Student data should be stored in a structvariable of type studentType, 
which has four components: studentFName and studentLName of type string,
 testScore of type int (testScore is between 0 and 100), and grade of type char. 
 Suppose that the class has 20 students. Use an array of 20 components of type
  studentType
. Your program must contain at least the following functions:
A function to read the students’ data into the array.
A function to assign the relevant grade to each student.
A function to find the highest test score.
A function to print the names of the students having the highest test score.
Your program must output each student’s name in this form: last name followed
 by a comma, followed by a space, followed by the first name; the name must
  be left justified. Moreover, other than declaring the variables and opening 
  the input and output files, the function main should only be a collection of
   function calls.
Your program should accept no input and save the output to Ch9_Ex2Out.txt*/

//Oct 28, 18
#include <iostream>
#include <string>
#include <fstream>
#include <iomanip>
using namespace std;
struct studentType
{
    string studentFName;
    string studentLName;
    int testScore;
    char grade;
};
void getData(ifstream &inFile, studentType sList[], int listSize);
void calculateGrade(studentType sList[], int listSize);
int highestScore(const studentType sList[], int listSize);
void printResult(const studentType sList[], int listSize);
int main()
{
    ifstream in;
    in.open("Ch9_Ex2Data.txt");
    if (in.fail()) //is it ok?
    {
        cout << "file did not open please check it\n";
        system("pause");
        system("exit");
    }
    studentType sList[20];
    getData(in, sList, 20);
    calculateGrade(sList, 20);
    printResult(sList, 20);
    in.close();
    system("pause");
    return 0;
}

void getData(ifstream &inFile, studentType sList[], int listSize)
{
    int n = 0;
    while (n < listSize)
    {
        inFile >> sList[n].studentLName >> sList[n].studentFName
         >> sList[n].testScore;
        n++;
    }
}
void calculateGrade(studentType sList[], int listSize)
{
    int i;
    for (i = 0; i < listSize; i++)
        if (sList[i].testScore < 60)
            sList[i].grade = 'F';
        else if (sList[i].testScore < 70)
            sList[i].grade = 'D';
        else if (sList[i].testScore < 80)
            sList[i].grade = 'C';
        else if (sList[i].testScore < 90)
            sList[i].grade = 'B';
        else
            sList[i].grade = 'A';
}
int highestScore(const studentType sList[], int listSize)
{
    ofstream outdata; // outdata is like cin
    int high = 0, i;
    for (i = 0; i < listSize; i++)
        if (high < sList[i].testScore)
            high = sList[i].testScore;
    return high;
}
void printResult(const studentType sList[], int listSize)
{
    // Added
    ofstream outputFile;
    outputFile.open("Ch9_Ex2Output.txt");
    if (!outputFile)
    {
        cerr << "File not Found!" << endl;
        exit(1);
    }
    outputFile << left << setw(30) << "Student Name" << right << setw(10) 
    << " TestScore  " << right << setw(7) << "Grade" << endl;
    string name;
    int high, i;
    for (i = 0; i < listSize; i++)
    {
        name = sList[i].studentLName + ", " + sList[i].studentFName;
        outputFile << left << setw(30) << name << right << setw(7) 
        << sList[i].testScore << right << setw(10) << sList[i].grade << endl;
    }
    outputFile << endl;
    high = highestScore(sList, listSize);
    outputFile << "Highest Test Score: " << high << endl;
    outputFile << "Students having the highest test score: " << endl;
    for (int i = 0; i < listSize; i++)
        if (sList[i].testScore == high)
            outputFile << sList[i].studentLName << ", " << sList[i].studentFName 
            << endl;
    outputFile.close();
}
