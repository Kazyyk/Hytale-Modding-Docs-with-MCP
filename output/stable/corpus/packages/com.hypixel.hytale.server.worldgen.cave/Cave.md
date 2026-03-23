# Cave

Type: class | Package: com.hypixel.hytale.server.worldgen.cave

public class Cave

Represents a generated cave structure containing cave nodes organized by chunk index, with bounds tracking.

## Key Methods

- public long getNodeCount()
- public CaveType getCaveType()
- public WorldBounds getBounds()
- public void addNode(@Nonnull CaveNode element)
- public boolean contains(long chunkIndex)
- public CaveNode[] getCaveNodes(long chunkIndex)
- public void compile()
- public String toString()
