<!DOCTYPE html>
<html>
<head>
    <title>Upload Blog Post</title>
    <!-- Add Firebase SDK -->
    <script src="https://www.gstatic.com/firebasejs/8.10.0/firebase-app.js"></script>
    <script src="https://www.gstatic.com/firebasejs/8.10.0/firebase-storage.js"></script>
    <script src="https://www.gstatic.com/firebasejs/8.10.0/firebase-firestore.js"></script>
</head>
<body>
    <h1>Upload Blog Post</h1>
    <form id="uploadForm" enctype="multipart/form-data">
        <label for="file">Choose File</label>
        <input type="file" id="file" name="file">
        <br>
        <label for="title">Title</label>
        <input type="text" id="title" name="title">
        <br>
        <label for="description">Description</label>
        <textarea id="description" name="description"></textarea>
        <br>
        <label for="movieurl">movieurl</label>
        <input type="text" id="movieurl" name="movieurl">
        <br>
        <input type="submit" value="Upload">
    </form>
    <div id="uploadProgress"></div>
    <script>
        // Initialize Firebase
        var firebaseConfig = {
            apiKey: "AIzaSyBMCqAXF6fj1MITXWDNBIZvWC_F7CZZPiQ",
    authDomain: "upload-bc8ca.firebaseapp.com",
    projectId: "upload-bc8ca",
    storageBucket: "upload-bc8ca.appspot.com",
    messagingSenderId: "781882071295",
    appId: "1:781882071295:web:8febb4026380367a44d4ca",
    measurementId: "G-00HQHGHD1F"
        };
        
        // Initialize Firebase app
        firebase.initializeApp(firebaseConfig);
        // Get a reference to the storage service
        var storage = firebase.storage();
        // Get a reference to the firestore service
        var firestore = firebase.firestore();
        
        // Form submit event handler
        document.getElementById('uploadForm').addEventListener('submit', async function(e) {
            e.preventDefault();
            var file = document.getElementById('file').files[0];
            var title = document.getElementById('title').value;
            var description = document.getElementById('description').value;
            var movieurl = document.getElementById('movieurl').value;
            
            // Upload file to Firebase Storage
            var storageRef = storage.ref('blog_posts/' + file.name);
            var snapshot = await storageRef.put(file);
            console.log('File uploaded', snapshot);
            
            // Get download URL for the uploaded file
            var downloadURL = await snapshot.ref.getDownloadURL();
            
            // Add file details to Firestore
            await firestore.collection('blog_posts').add({
                title: title,
                description: description,
                fileURL: downloadURL,
                movieurl: movieurl
            });
            
            console.log('File details added to Firestore');
            
            // Reset form
            document.getElementById('uploadForm').reset();
        });
    </script>
</body>
</html>
