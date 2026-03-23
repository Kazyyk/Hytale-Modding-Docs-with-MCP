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
