# ReusableList

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator

public class ReusableList<T>

List wrapper with soft-size tracking that reuses existing slots before expanding, reducing allocation pressure.

## Key Methods

- public void expandAndSet(T element)
- public T expandAndGet()
- public int getSoftSize()
- public int getHardSize()
- public boolean isAtHardCapacity()
- public T get(int index)
- public void clear()
