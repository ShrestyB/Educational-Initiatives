# Overview
This project implements a notification system using the Observer design pattern, allowing students to receive real-time updates on assignment deadlines set by teachers. When a teacher updates a deadline, all subscribed students are automatically notified.

## Features
Teacher and Student Roles: Teachers can set or change assignment deadlines, while students receive notifications.
Real-time Notifications: Students are notified immediately when deadlines are updated.
Dynamic Subscription: Students can subscribe or unsubscribe from notifications.
Design Pattern Used
Observer Pattern: The teacher acts as the subject, and students act as observers. When the teacher updates the deadline, all subscribed students receive notifications.


## Output
<img width="416" alt="image" src="https://github.com/user-attachments/assets/18da9321-feea-4498-8310-5e6095ca10e5">



## Usage
Create a teacher instance and student instances.
Students can subscribe to the teacher for notifications.
Teachers can set deadlines using the setDeadline() method, which will notify all subscribed students.
Logging
A logging utility is implemented to track significant events and actions within the system.

