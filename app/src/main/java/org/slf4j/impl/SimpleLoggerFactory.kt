package org.slf4j.impl

import org.slf4j.ILoggerFactory
import org.slf4j.Logger

/****************************************************************************************************************************
 */
class SimpleLoggerFactory(private val loggerMap: MutableMap<String, SimpleLoggerAdapter> = HashMap()) : ILoggerFactory {

    override fun getLogger(name: String): Logger? {
        synchronized(loggerMap) {
            if (!loggerMap.containsKey(name)) {
                loggerMap.put(name, SimpleLoggerAdapter(name))
            }
            return loggerMap[name]
        }
    }

}
