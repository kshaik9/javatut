package com.kdrtut.collections;

public class CursorsCompTable {

    /**
     *
     *      Property    |   Enumeration             |   Interator               |   ListIterator                        |
     * ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
     * Applicable for   |   Only Legacy Classes     |   Any collection class    |   List implemented classes            |
     * ------------------------------------------------------------------------------------------------------------------
     * Movement         |   Only Forward            |   Only Forward            |   Both Forward & Backward             |
     * ------------------------------------------------------------------------------------------------------------------
     * Accessibility    |   Only Read Access        |   Read & Remove           |   Read, Remove, Replace & Add         |
     * ------------------------------------------------------------------------------------------------------------------
     * How to use it?   |   Elements() of Vector    |   Iterator() method of    |   ListIterator() of                   |
     *                  |       class               |       Collection(I)       |       List(I)                         |
     * ------------------------------------------------------------------------------------------------------------------
     * Methods          |   2 Methods               |   3 Methods               |   9 Methods                           |
     *                  |   1. hasMoreElements()    |   1. hasNext()            |   1. hasNext() 2. next()              |
     *                  |   2. nextElement()        |   2. next()               |   3. nextIndex() 4. hasPrevious()     |
     *                  |                           |   3. remove()             |   5. previous() 6. previousIndex()    |
     *                  |                           |                           |   7. add() 8. set() 9. remove()       |
     * ------------------------------------------------------------------------------------------------------------------
     * Is it Legacy?    |   Yes (V 1.0)             |   No (V 1.2)              | No (V 1.2)                            |
     * ------------------------------------------------------------------------------------------------------------------
     */
}
