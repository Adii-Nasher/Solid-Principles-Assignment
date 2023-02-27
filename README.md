# Solid-Principles-Assignment

Identify how the following code violates the Liskov Substitution Principle? Also, correct the code in order it to be correct as per the Liskov Substitution Principle.


Code:
- class Rectangle{
 - int m_width;
 - int m_height;
 
 - public void setWidth(int width){
 -   m_width = width;
 - }
 
 - public void setHeight(int h) {
 -  m_height = h;
 - }
 
 - public int getWidth() {
 - return m_width;
 - }
 
 - public int getHeight() {
 - return m_height;
 - }
 
 - public int getArea() {
 - return m_width * m_height;
 - }
 
- }

- class Square extends Rectangle {
- public void setWidth (int width) {
-  m_width = width;
-   m_height = width;
- }
 
- public void setHeight (int height) {
-   m_width = height;
-   m_height = height;
- }
- }
