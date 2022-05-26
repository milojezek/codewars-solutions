object FileNameExtractor {
  fun extractFileName(dirtyFileName: String): String {
    return dirtyFileName.slice(dirtyFileName.indexOf("_") + 1
                              ..dirtyFileName.indexOf(".", dirtyFileName.indexOf(".") + 1) - 1)
  }
}
