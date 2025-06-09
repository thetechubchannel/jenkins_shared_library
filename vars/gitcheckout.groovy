def call(String repoUrl, String branchName = 'main') {
    echo "Checking out branch: ${branchName} from ${repoUrl}"
    checkout([
        $class: 'GitSCM',
        branches: [[name: "*/${branchName}"]],
        userRemoteConfigs: [[url: repoUrl]]
    ])
}