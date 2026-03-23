# Warp

Type: class | Package: com.hypixel.hytale.builtin.teleport | Extends: null

public class Warp

## Fields

- public static final Codec<Warp> CODEC
- public static final ArrayCodec<Warp> ARRAY_CODEC
- private String id
- private String world
- private Transform transform
- private String creator
- private Instant creationDate
- Warp warp
- int result
- World worldInstance

## Constructors

- public Warp()
- public Warp(@Nonnull Transform transform, @Nonnull String id, @Nonnull World world, @Nonnull String creator, @Nonnull Instant creationDate)

## Methods

- public String getId()
- public String getWorld()
- public Transform getTransform()
- public String getCreator()
- public Instant getCreationDate()
- public boolean equals(@Nullable Object o)
- public int hashCode()
- public String toString()
- public Teleport toTeleport()

Also in this package: TeleportPlugin, WarpComponent, WarpListPage, WarpListPageEventData, WarpMarkerProvider

Complete API:
  public String getId()
  public String getWorld()
  public Transform getTransform()
  public String getCreator()
  public Instant getCreationDate()
  public boolean equals(Object o)
  public int hashCode()
  public String toString()
  public Teleport toTeleport()

Fields:
public static final Codec<Warp> CODEC
public static final ArrayCodec<Warp> ARRAY_CODEC
private String id
private String world
private Transform transform
private String creator
private Instant creationDate
