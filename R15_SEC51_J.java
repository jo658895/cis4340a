// Rule 15. Platform Security (SEC)
// SEC51-J. Minimize privileged code

public void changePassword(String currentPassword, String newPassword) {
    final FileInputStream f[] = { null };

    AccessController.doPrivileged(new PrivilegedAction() {
        public Object run() {
            try {
                String passwordFile = System.getProperty("user.dir") + File.Separator + "PasswordFileName";
                f[0] = new FileInputStream(passwordFile);
                // Check whether oldPassword matches the one in the file
                // If not, throw an exception
                System.loadLibrary("authentication");
            } catch (FileNotFoundException cnf) {
                // Forward to handler
            }
            return null;
        }
    }); // End of doPrivileged()
}
