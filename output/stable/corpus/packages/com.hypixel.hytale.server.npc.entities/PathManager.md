# PathManager

Type: class | Package: com.hypixel.hytale.server.npc.entities

public class PathManager

## Fields

- private UUID currentPathHint
- private IPath<?> currentPath

## Methods

- public void setPrefabPath(@Nonnull UUID currentPath, @Nonnull IPrefabPath path)
- public void setTransientPath(@Nonnull IPath<?> path)
- public boolean isFollowingPath()
- @Nullable public UUID getCurrentPathHint()
- @Nullable public IPath<?> getPath(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)

Also in this package: NPCEntity

Complete API:
  public void setPrefabPath(UUID currentPath, IPrefabPath path)
  public void setTransientPath(IPath<?> path)
  public boolean isFollowingPath()
  public UUID getCurrentPathHint()
  public IPath<?> getPath(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)

Fields:
public static final BuilderCodec<PathManager> CODEC
private UUID currentPathHint
private IPath<?> currentPath
