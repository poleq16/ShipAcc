package file

import java.util.concurrent.CopyOnWriteArraySet
import java.util.concurrent.atomic.AtomicInteger

object Lines {
    val idCounter = AtomicInteger()
    private val lines = CopyOnWriteArraySet<Line>()

    fun add(l: Line) : Line {
        lines.add(l)
        return l
    }

}