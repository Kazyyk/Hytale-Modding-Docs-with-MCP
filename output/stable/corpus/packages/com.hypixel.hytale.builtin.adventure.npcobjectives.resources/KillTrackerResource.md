# KillTrackerResource

Type: class | Package: com.hypixel.hytale.builtin.adventure.npcobjectives.resources | Implements: Resource

public class KillTrackerResource implements Resource<EntityStore>

ECS resource attached to `EntityStore`.

## Accessors

- getResourceType() | ResourceType<EntityStore, KillTrackerResource> | Accessor method.
- getKillTasks() | List<KillTaskTransaction> | Accessor method.

## Methods

- watch(KillTaskTransaction task) | void | Instance method.
- unwatch(KillTaskTransaction task) | void | Instance method.

Complete API:
  public static ResourceType<EntityStore,KillTrackerResource> getResourceType()
  public void watch(KillTaskTransaction task)
  public void unwatch(KillTaskTransaction task)
  public List<KillTaskTransaction> getKillTasks()
  public Resource<EntityStore> clone()

Fields:
private final List<KillTaskTransaction> killTasks
