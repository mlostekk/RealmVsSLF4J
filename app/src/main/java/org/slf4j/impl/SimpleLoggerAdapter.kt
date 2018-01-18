package org.slf4j.impl

import android.util.Log.*
import org.slf4j.helpers.MarkerIgnoringBase

/****************************************************************************************************************************
 */
class SimpleLoggerAdapter internal constructor(name: String) : MarkerIgnoringBase() {


    /****************************************************************************************************************************
     */
    init {
        this.name = name
    }

    /****************************************************************************************************************************
     */
    private fun log(level: Int, throwable: Throwable?, message: String, vararg objs: Any) {
        android.util.Log.println(level, "TAG", message)
    }

    /****************************************************************************************************************************
     */
    override fun isTraceEnabled(): Boolean = true

    override fun trace(msg: String) {
        log(VERBOSE, null, msg)
    }

    override fun trace(format: String, arg: Any) {
        log(VERBOSE, null, format, arg)
    }

    override fun trace(format: String, arg1: Any, arg2: Any) {
        log(VERBOSE, null, format, arg1, arg2)
    }

    override fun trace(format: String, vararg arguments: Any) {
        log(VERBOSE, null, format, *arguments)
    }

    override fun trace(msg: String, t: Throwable) {
        log(VERBOSE, t, msg)
    }

    /****************************************************************************************************************************
     */
    override fun isDebugEnabled(): Boolean = true

    override fun debug(msg: String) {
        log(DEBUG, null, msg)
    }

    override fun debug(format: String, arg: Any) {
        log(DEBUG, null, format, arg)
    }

    override fun debug(format: String, arg1: Any, arg2: Any) {
        log(DEBUG, null, format, arg1, arg2)
    }

    override fun debug(format: String, vararg arguments: Any) {
        log(DEBUG, null, format, *arguments)
    }

    override fun debug(msg: String, t: Throwable) {
        log(DEBUG, t, msg)
    }

    /****************************************************************************************************************************
     */
    override fun isInfoEnabled(): Boolean = true

    override fun info(msg: String) {
        log(INFO, null, msg)
    }

    override fun info(format: String, arg: Any) {
        log(INFO, null, format, arg)
    }

    override fun info(format: String, arg1: Any, arg2: Any) {
        log(INFO, null, format, arg1, arg2)
    }

    override fun info(format: String, vararg arguments: Any) {
        log(INFO, null, format, *arguments)
    }

    override fun info(msg: String, t: Throwable) {
        log(INFO, t, msg)
    }

    /****************************************************************************************************************************
     */
    override fun isWarnEnabled(): Boolean = true

    override fun warn(msg: String) {
        log(WARN, null, msg)
    }

    override fun warn(format: String, arg: Any) {
        log(WARN, null, format, arg)
    }

    override fun warn(format: String, arg1: Any, arg2: Any) {
        log(WARN, null, format, arg1, arg2)
    }

    override fun warn(format: String, vararg arguments: Any) {
        log(WARN, null, format, *arguments)
    }

    override fun warn(msg: String, t: Throwable) {
        log(WARN, t, msg)
    }

    /****************************************************************************************************************************
     */
    override fun isErrorEnabled(): Boolean = true

    override fun error(msg: String) {
        log(ERROR, null, msg)
    }

    override fun error(format: String, arg: Any) {
        log(ERROR, null, format, arg)
    }

    override fun error(format: String, arg1: Any, arg2: Any) {
        log(ERROR, null, format, arg1, arg2)
    }

    override fun error(format: String, vararg arguments: Any) {
        log(ERROR, null, format, *arguments)
    }

    override fun error(msg: String, t: Throwable) {
        log(ERROR, t, msg)
    }

}
