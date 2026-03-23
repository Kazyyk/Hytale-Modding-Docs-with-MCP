# Memory

Type: abstract class | Package: com.hypixel.hytale.builtin.adventure.memories.memories

public abstract class Memory

Abstract base type in the Memory hierarchy.

## Accessors

- getId() | abstract String | Accessor method.
- getTitle() | abstract String | Accessor method.
- getTooltipText() | abstract Message | Accessor method.
- getIconPath() | abstract String | Accessor method.
- getUndiscoveredTooltipText() | abstract Message | Accessor method.

Known subclasses: NPCMemory

Also in this package: MemoryProvider

Complete API:
  public abstract String getId()
  public abstract String getTitle()
  public abstract Message getTooltipText()
  public abstract String getIconPath()
  public abstract Message getUndiscoveredTooltipText()
  public boolean equals(Object o)
  public int hashCode()
  public String toString()

Fields:
public static final CodecMapCodec<Memory> CODEC
