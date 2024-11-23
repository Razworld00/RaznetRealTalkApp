
Raznet RealTalk is a modern Android application that enables real-time chat functionality, user authentication, and seamless navigation between multiple screens. It is built using Jetpack Compose and Firebase for authentication and database management, offering a robust foundation for future enhancements.

📱 Features
User Authentication: Secure login and signup using Firebase Authentication.
Real-Time Navigation: Smooth navigation between screens (Login, Home, Chat, Profile) powered by Jetpack Compose.
Responsive UI: Built with Material Design 3 components for a clean and intuitive user experience.
Modular Architecture: Organized and maintainable code structure with separate files for each screen (LoginScreen, ChatScreen, etc.).
Firebase Integration: Real-time database functionality integrated with Firebase services.
🛠️ Tech Stack
Frontend:
Jetpack Compose: For modern and declarative UI.
Material Design 3: Ensures responsive and attractive interfaces.
Backend:
Firebase Authentication: Handles user login and registration.
Firebase Realtime Database: (Placeholder) For future chat functionality.
🔨 Current Project State
The app includes:

LoginScreen:
Allows users to log in or register using email and password.
HomeScreen:
Welcomes the user and provides navigation buttons to other screens.
ChatScreen:
(Currently a placeholder) Displays static text but will include real-time chat functionality.
ProfileScreen:
(Currently a placeholder) Displays static profile text but will support user-specific information.
🚀 Future Plans
Real-Time Chat:
Implement Firebase Realtime Database to enable live chat between users.
Profile Customization:
Allow users to update their profiles and display personalized data.
Advanced UI Enhancements:
Add animations, icons, and themes to improve user experience.
Bottom Navigation Bar:
Introduce a bottom navigation bar for easier screen transitions.
📂 Project Structure
plaintext
Copy code
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
Prerequisites:
Android Studio installed.
Firebase project set up with google-services.json in the /app directory.
Steps:
Clone the repository:
bash
Copy code
git clone https://github.com/Razworld00/RaznetRealTalkApp.git
Open the project in Android Studio.
Sync Gradle files to fetch dependencies.
Run the app on an emulator or connected device:
bash
Copy code
Shift + F10
🤝 Contributing
Contributions, issues, and feature requests are welcome!
Feel free to check the issues page.

📜 License
This project is licensed under the MIT License. See the LICENSE file for details.
