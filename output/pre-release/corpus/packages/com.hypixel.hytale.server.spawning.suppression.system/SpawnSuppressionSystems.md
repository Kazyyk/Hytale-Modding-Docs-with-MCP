# SpawnSuppressionSystems

Type: class | Package: com.hypixel.hytale.server.spawning.suppression.system

public class SpawnSuppressionSystems

Container for entity-level spawn suppression ECS systems. Inner class `Suppressor` registers/unregisters suppression zones when entities spawn or are removed. Inner class `Load` rebuilds suppression maps on world load and asset reload. Inner class `EnsureNetworkSendable` adds network IDs to suppression components.
