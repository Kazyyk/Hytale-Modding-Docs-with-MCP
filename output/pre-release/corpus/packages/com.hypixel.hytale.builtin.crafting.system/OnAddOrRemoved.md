# OnAddOrRemoved

Type: class | Package: com.hypixel.hytale.builtin.crafting.system | Extends: RefSystem

public static class OnAddOrRemoved extends RefSystem

ECS system that handles bench block entity lifecycle. On add, checks if the block type has a valid bench configuration; on remove, closes all open windows and drops stored upgrade items as item entities.
