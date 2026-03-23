# ReturnToHubButtonUI

Type: class | Package: com.hypixel.hytale.builtin.creativehub.ui

public final class ReturnToHubButtonUI

## Fields

- public static final String ANCHOR_ID
- public static final String ACTION_RETURN_TO_HUB

## Methods

- public static void register()
- public static void send(PlayerRef playerRef)
- public static void send(PlayerRef playerRef, boolean disabled)
- public static void clear(PlayerRef playerRef)
- public static void executeReturnToHub(PlayerRef playerRef, Ref<EntityStore> ref, Store<EntityStore> store)
- @Nullable private static World findParentHubWorld(Store<EntityStore> store, Ref<EntityStore> ref)

Complete API:
  public static void register()
  public static void send(PlayerRef playerRef)
  public static void send(PlayerRef playerRef, boolean disabled)
  public static void clear(PlayerRef playerRef)
  public static void executeReturnToHub(PlayerRef playerRef, Ref<EntityStore> ref, Store<EntityStore> store)
  private static World findParentHubWorld(Store<EntityStore> store, Ref<EntityStore> ref)

Fields:
public static final String ANCHOR_ID
public static final String ACTION_RETURN_TO_HUB
