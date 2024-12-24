def call() {
    // 获取变更内容
    def previousCommit = sh(script: "git rev-parse HEAD~1", returnStdout: true).trim()
    def currentCommit = sh(script: "git rev-parse HEAD", returnStdout: true).trim()
    def changes = sh(script: "git diff ${previousCommit} ${currentCommit}", returnStdout: true)
    return changes
}
