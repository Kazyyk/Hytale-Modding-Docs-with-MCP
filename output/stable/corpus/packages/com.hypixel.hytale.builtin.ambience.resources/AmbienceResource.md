# AmbienceResource

Type: class | Package: com.hypixel.hytale.builtin.ambience.resources | Implements: Resource

public class AmbienceResource implements Resource<EntityStore>

ECS resource attached to `EntityStore`.

## Accessors

- getResourceType() | ResourceType<EntityStore, AmbienceResource> | Accessor method.
- setForcedMusicAmbience(String musicAmbienceId) | void | Mutator method.
- getForcedMusicIndex() | int | Accessor method.

Complete API:
  public static ResourceType<EntityStore,AmbienceResource> getResourceType()
  public void setForcedMusicAmbience(String musicAmbienceId)
  public int getForcedMusicIndex()
  public Resource<EntityStore> clone()

Fields:
private int forcedMusicIndex
