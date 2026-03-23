# ProcessingBenchLifecycle

Type: class | Package: com.hypixel.hytale.builtin.crafting.system | Extends: RefSystem

public static class ProcessingBenchLifecycle extends RefSystem

ECS system that handles processing bench block lifecycle. On add, initializes the bench configuration and sets up input/output/fuel slots. On remove (non-unload), drops all contained items as item entities.
