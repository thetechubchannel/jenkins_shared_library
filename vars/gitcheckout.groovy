def call(String repoUrl, String branchName = 'main') {
    echo "Checking out branch: ${branchName} from ${repoUrl}"
    def scmConfig = [
        $class: 'GitSCM',
        branches: [[name: "*/${branchName}"]],
        userRemoteConfigs: [[
            url: repoUrl,
            credentialsId: credentialsId
        ]]
    ]
}