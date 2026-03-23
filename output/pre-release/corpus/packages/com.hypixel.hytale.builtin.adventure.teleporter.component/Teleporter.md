# Teleporter

Type: class | Package: com.hypixel.hytale.builtin.adventure.teleporter.component | Implements: Component

public class Teleporter implements Component

## Fields

- public static final BuilderCodec<Teleporter> CODEC
- public static final String ACTIVATE_STATE
- public static final String INACTIVE_STATE
- private UUID worldUuid
- private Transform transform
- private byte relativeMask
- private String warp
- private String ownedWarp
- private boolean isCustomName
- private String warpNameWordListKey

## Methods

- public static ComponentType<ChunkStore,Teleporter> getComponentType()
- @Nullable public UUID getWorldUuid()
- public void setWorldUuid(UUID worldUuid)
- @Nullable public Transform getTransform()
- public void setTransform(Transform transform)
- public byte getRelativeMask()
- public void setRelativeMask(byte relativeMask)
- @Nullable public String getWarp()
- public void setWarp(String warp)
- @Nullable public String getOwnedWarp()
- public void setOwnedWarp(String ownedWarp)
- public boolean hasOwnedWarp()
- public void setWarpNameWordListKey(String warpNameWordListKey)
- public boolean isCustomName()
- public void setIsCustomName(boolean customName)
- @Nullable public String getWarpNameWordListKey()
- @Nullable public WordList getWarpNameWordList()
- public boolean isValid()
- @Nonnull @Override public Component<ChunkStore> clone()
- @Nullable public Teleport toTeleport(Vector3d currentPosition, Vector3f currentRotation, Vector3i blockPosition)

Complete API:
  public static ComponentType<ChunkStore,Teleporter> getComponentType()
  public UUID getWorldUuid()
  public void setWorldUuid(UUID worldUuid)
  public Transform getTransform()
  public void setTransform(Transform transform)
  public byte getRelativeMask()
  public void setRelativeMask(byte relativeMask)
  public String getWarp()
  public void setWarp(String warp)
  public String getOwnedWarp()
  public void setOwnedWarp(String ownedWarp)
  public boolean hasOwnedWarp()
  public void setWarpNameWordListKey(String warpNameWordListKey)
  public boolean isCustomName()
  public void setIsCustomName(boolean customName)
  public String getWarpNameWordListKey()
  public WordList getWarpNameWordList()
  public boolean isValid()
  public Component<ChunkStore> clone()
  public Teleport toTeleport(Vector3d currentPosition, Vector3f currentRotation, Vector3i blockPosition)

Fields:
public static final BuilderCodec<Teleporter> CODEC
public static final String ACTIVATE_STATE
public static final String INACTIVE_STATE
private UUID worldUuid
private Transform transform
private byte relativeMask
private String warp
private String ownedWarp
private boolean isCustomName
private String warpNameWordListKey
