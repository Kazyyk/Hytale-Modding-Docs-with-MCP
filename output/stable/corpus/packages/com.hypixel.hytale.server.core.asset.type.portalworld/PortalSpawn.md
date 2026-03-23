# PortalSpawn

Type: class | Package: com.hypixel.hytale.server.core.asset.type.portalworld

public class PortalSpawn

Class in the portalworld subsystem.

## Fields

- scanHeight | int | int field.
- checkSpawnY | int | int field.
- minRadius | int | int field.
- maxRadius | int | int field.
- chunkDartThrows | int | int field.
- checksPerChunk | int | int field.

## Methods

- getCenter() | Vector3i | public method.
- getCheckSpawnY() | int | public method.
- getScanHeight() | int | public method.
- getMinRadius() | int | public method.
- getMaxRadius() | int | public method.
- getChunkDartThrows() | int | public method.
- getChecksPerChunk() | int | public method.

Also in this package: PillTag, PortalDescription, PortalType

Complete API:
  public Vector3i getCenter()
  public int getCheckSpawnY()
  public int getScanHeight()
  public int getMinRadius()
  public int getMaxRadius()
  public int getChunkDartThrows()
  public int getChecksPerChunk()

Fields:
public static final BuilderCodec<PortalSpawn> CODEC
private Vector3i center
private int scanHeight
private int checkSpawnY
private int minRadius
private int maxRadius
private int chunkDartThrows
private int checksPerChunk
