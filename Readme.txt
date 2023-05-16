Welcome to my "Short the URL" application.
As you are new here let me guide you for further processes.

You can see two folders:
1.short-url-app angular 
2.short-url-app rest

The first one is having angular application and second one having Backend application.

We need both" Angular" and "Rest" applications we need to be running.

Download both "short-url-app angular" and "short-url-app" folders.

Steps to import Backend project:

Step 1. Install an IDE to import Maven project (you can use either of these 	eclips/STS/intellij).
Step 2. Import existing maven project:
	Import > Import Maven Project > Import Existing Modules 
	       > select short-url-app rest > Finish.
Step 3. Run command "mvn clean install" to resolve all the dependencies.
Step 4. Run the application: open ShortUrlApplication.java > Right Click 
	> Run As > Java Application.

Steps to run angular application:
Step 1.Install VS code (if you have it don't install again).
Step 2.Click on Open Folder, select 'short-url-app angular; folder.
Step 3.Open 'command prompt' in windows or 'terminal' in linux.
step 4.Install node and angular by using following command:
	* Visit the official Node.js website: https://nodejs.org
	* Download the appropriate installer for your operating system (Windows, macOS, 	  Linux).
	* Run the installer and follow the installation prompts.
	* Verify the installation by opening a command prompt (or terminal) and running the 	  command: node -v. It should display the version number of Node.js.
	* Angular CLI Installation: Run 'npm install -g @angular/cli'
	* Test it out by : Run 'ng version'

Step 5.Run angular application by using "ng serve".
Step 6.UI will be loaded. Enter url which you want to be short. Then click on 'Generate 	Short URL' if url entered is valid, output will be generated under 'Short URL' section.
Otherwise you open you console you will be able to see 400 Bad Request error (in case of stirng being empty).



Thanks you,
Abhay Gupta


