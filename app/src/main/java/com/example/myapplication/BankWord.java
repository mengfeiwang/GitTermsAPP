package com.example.myapplication;

/**
 * This BankWord program implements an application that simply store all the words and return the
 * definitions or words.
 */
public class BankWord {

    /**
     * Creates a String array that store all the definitions of words.
     */
    public String mBankWord[]= {
            "Congratulations",
            "The last modification to each line of a file, which generally displays the revision, author and time.",
            "A parallel version of a repository. It is contained within the repository, but does not affect the primary or master branch allowing you to work freely without disrupting the \"live\" version. When you've made the changes you want to make, you can merge your branch back into the master branch to publish your changes.",
            "A  copy of a repository that lives on your computer instead of on a website's server somewhere, or the act of making that copy. With your clone you can edit the files in your preferred editor and use Git to keep track of your changes without having to be online. It is, however, connected to the remote version so that changes can be synced between the two. You can push your local changes to the remote to keep them synced when you're online.",
            "A person with read and write access to a repository who has been invited to contribute by the repository owner.",
            "An individual change to a file (or set of files). It's like when you save a file, except with Git, every time you save it creates a unique ID (a.k.a. the \"SHA\" or \"hash\") that allows you to keep record of what changes were made when and by who. Commits usually contain a commit message which is a brief description of what changes were made.",
            "The difference in changes between two commits, or saved changes. The diff will visually describe what was added or removed from a file since its last commit.",
            "Getting the latest changes from an online repository without merging them in. Once these changes are fetched you can compare them to your local branches (the code residing on your local machine).",
            "A personal copy of another user's repository that lives on your account. Forks allow you to freely make changes to a project without affecting the original. Forks remain attached to the original, allowing you to submit a pull request to the original's author to update with your changes. You can also keep your fork up to date by pulling in updates from the original.",
            "Suggested improvements, tasks or questions related to the repository. Issues can be created by anyone (for public repositories), and are moderated by repository collaborators. Each issue contains its own discussion forum, can be labeled and assigned to a user.",
            "Takes the changes from one branch (in the same repository or from a fork), and applies them into another. This often happens as a pull request (which can be thought of as a request to merge), or via the command line. A merge can be done automatically via a pull request via the GitHub web interface if there are no conflicting changes, or can always be done via the command line.",
            "Repositories that can only be viewed or contributed to by their creator and collaborators the creator specified.",
            "When you are fetching in changes and merging them. For instance, if someone has edited the remote file you're both working on, you'll want to pull in those changes to your local copy so that it's up to date.",
            "Proposed changes to a repository submitted by a user and accepted or rejected by a repository's collaborators.",
            "Sending your committed changes to a remote repository, such as a repository hosted on GitHub. For instance, if you change something locally, you'd want to then push those changes so that others may access them.",
            "The most basic element of GitHub. They're easiest to imagine as a project's folder. A repository contains all of the project files (including documentation), and stores each file's revision history. Repositories can have multiple collaborators and can be either public or private.",
    };
    /**
     * Create a String array that store all the choices for four buttons.
     */
    public String mChoice[][]= {
            {"CONGRATULATION!!","CONGRATULATION!!","CONGRATULATION!!","CONGRATULATION!!"},
            {"Blame", "Baud", "Bespoke", "Analogue"},
            {"BarCraft","Bitmap","Branch","Bloatware"},
            {"Checksum","Cybersecurity","Clone","Encryptioncuit"},
            {"Cloud Computing","Codec","Collaborator","Bluetooth"},
            {"URL","Commit","WEP","WPA"},
            {"Ethernet","Firewall","FTP","Diff"},
            {"Megabyte","Megahertz","HTML","Fetch"},
            {"Modem","POP","Fork","Protocol"},
            {"SAAS","Issue","ROM","Fakersation"},
            {"Digitize","Rankify","Merge","Moodle"},
            {"Videotize","Private Repositories","Buffer","Breadcrumbs"},
            {"Pull","Loup","Gigaflops","Spendlytics"},
            {"Peopleware","Commjacking","Flaming","Pull Request"},
            {"Whitelist","Push","Uncloud","Accelerometer"},
            {"Repository","Ethernet","IBM","Macintosh"},

    };
    /**
     * Create a String Array that stores all the right answers for the choices
     */
    private String mAnswer[]={"CONGRATULATION!!","Blame","Branch","Clone","Collaborator","Commit","Diff","Fetch","Fork","Issue","Merge","Private Repositories","Pull","Pull Request","Push","Repository"};

    /**
     * Those are the getters for word definitions, choices, and the correct answer.
     * @param a
     * @return
     */
    public String getBankWord(int a){
        String bankWord =mBankWord[a];
        return bankWord;
    }
    public String getChoice1(int a){
        String Choice=mChoice[a][0];
        return Choice;
    }
    public String getChoice2(int a){
        String Choice=mChoice[a][1];
        return Choice;
    }
    public String getChoice3(int a){
        String Choice=mChoice[a][2];
        return Choice;
    }
    public String getChoice4(int a){
        String Choice=mChoice[a][3];
        return Choice;
    }
    public String getCorrectAnswer(int a){
        String answer=mAnswer[a];
        return answer;
    }
}