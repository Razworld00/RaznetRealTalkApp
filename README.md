# Raznet RealTalk App

Raznet RealTalk is a modern Android application that enables real-time chat functionality, user authentication, and seamless navigation between multiple screens. It is built using Jetpack Compose and Firebase for authentication and database management, offering a robust foundation for future enhancements.

---

## 📱 Features
- **User Authentication**: Secure login and signup using Firebase Authentication.
- **Real-Time Navigation**: Smooth navigation between screens (`Login`, `Home`, `Chat`, `Profile`) powered by Jetpack Compose.
- **Responsive UI**: Built with Material Design 3 components for a clean and intuitive user experience.
- **Modular Architecture**: Organized and maintainable code structure with separate files for each screen (`LoginScreen`, `ChatScreen`, etc.).
- **Firebase Integration**: Real-time database functionality integrated with Firebase services.

---

## 🛠️ Tech Stack
### **Frontend**:
- Jetpack Compose: For modern and declarative UI.
- Material Design 3: Ensures responsive and attractive interfaces.

### **Backend**:
- Firebase Authentication: Handles user login and registration.
- Firebase Realtime Database: (Placeholder) For future chat functionality.

---

## 🔨 Current Project State
The app includes:
1. **LoginScreen**:
    - Allows users to log in or register using email and password.
2. **HomeScreen**:
    - Welcomes the user and provides navigation buttons to other screens.
3. **ChatScreen**:
    - (Currently a placeholder) Displays static text but will include real-time chat functionality.
4. **ProfileScreen**:
    - (Currently a placeholder) Displays static profile text but will support user-specific information.

---

## 🚀 Future Plans
- **Real-Time Chat**:
    - Implement Firebase Realtime Database to enable live chat between users.
- **Profile Customization**:
    - Allow users to update their profiles and display personalized data.
- **Advanced UI Enhancements**:
    - Add animations, icons, and themes to improve user experience.
- **Bottom Navigation Bar**:
    - Introduce a bottom navigation bar for easier screen transitions.

---

# Raznet RealTalk App

## Overview
Raznet RealTalk is a real-time chat application built using Jetpack Compose and Firebase Realtime Database.

## Recent Changes
- Added `ChatScreen` with dynamic message display.
- Integrated Firebase Realtime Database for storing and retrieving chat messages.
- Added Material3 dependency for modern UI components.
- Created `sendMessage` functionality for sending messages to Firebase.

## Dependencies
- Jetpack Compose
- Firebase Realtime Database
- Material3









## 📂 Project Structure
```plaintext

RaznetRealTalkApp/
│
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── kotlin/
│   │   │   │   ├── com.example.raznetrealtalkapp/
│   │   │   │   │   ├── MainActivity.kt
│   │   │   │   │   ├── LoginScreen.kt
│   │   │   │   │   ├── GreetingScreen.kt
│   │   │   │   │   ├── ChatScreen.kt
│   │   │   │   │   └── ProfileScreen.kt
│   │   │   ├── res/
│   │   │   └── AndroidManifest.xml
│   ├── build.gradle.kts
│
├── build.gradle.kts
├── .gitignore
├── README.md
🛠️ Setup Instructions
Prerequisites
Android Studio: Install the latest version of Android Studio.
Firebase Setup:
Create a Firebase project.
Download the google-services.json file and place it in the /app directory.
Steps
Clone the repository:
bash
Copy code
git clone https://github.com/Razworld00/RaznetRealTalkApp.git
Open the project in Android Studio.
Sync Gradle files to fetch all dependencies.
Run the app on an emulator or connected device:
bash
Copy code
Shift + F10
🤝 Contributing
Contributions, issues, and feature requests are welcome!
Feel free to check the issues page.

📜 License
This project is licensed under the MIT License. See the LICENSE file for details.

