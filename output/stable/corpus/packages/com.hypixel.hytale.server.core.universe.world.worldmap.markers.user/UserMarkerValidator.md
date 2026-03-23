# UserMarkerValidator

Type: class | Package: com.hypixel.hytale.server.core.universe.world.worldmap.markers.user

public final class UserMarkerValidator

## Fields

- private static final int NAME_LENGTH_LIMIT

## Methods

- public static UserMarkerValidator.PlaceResult validatePlacing(Ref<EntityStore> ref, CreateUserMarker packet)
- public static UserMarkerValidator.RemoveResult validateRemove(Ref<EntityStore> ref, UserMapMarker marker)
- private static boolean isPlayerTooFarFromMarker(Ref<EntityStore> ref, double markerX, double markerZ)
- private static double getMaxRemovalDistanceSquared(Player player)
- public record CanRemove()
- public record CanSpawn(Player player, UserMapMarkersStore markersStore)
- public record Fail(Message errorMsg)
