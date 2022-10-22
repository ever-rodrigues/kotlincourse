package com.course

    fun main() {

        val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr", "uniqueDescr2", "uniqueDescr3")
        fun addIssue(uniqueDesc: String): Boolean {
            return openIssues.add(uniqueDesc)
        }

        fun getStatusLog(isAdded: Boolean): String {
            return if (isAdded) "registered correctly." else "marked as duplicate and rejected"
        }

        val aNewIssue: String = "uniqueDescr4"
        val anIssueAlreadyIn: String = "uniqueDescr3"

        println("Issue $aNewIssue ${getStatusLog(addIssue(anIssueAlreadyIn))}")



    }

