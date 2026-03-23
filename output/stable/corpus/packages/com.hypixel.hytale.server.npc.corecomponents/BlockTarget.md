# BlockTarget

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents

public class BlockTarget

## Fields

- private final Vector3d position
- private int chunkChangeRevision
- private int foundBlockType
- @Nullable private ResourceView reservationHolder

## Methods

- @Nonnull public Vector3d getPosition()
- public int getChunkChangeRevision()
- public int getFoundBlockType()
- public void setChunkChangeRevision(int chunkChangeRevision)
- public void setFoundBlockType(int foundBlockType)
- public void setReservationHolder(ResourceView resourceView)
- public void reset(@Nonnull NPCEntity parent)
- public boolean isActive()
