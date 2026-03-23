# SerialInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.none | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.Interaction

public class SerialInteraction extends Interaction

Compiles a list of child interactions to run sequentially. The `tick0` method is never called directly; instead, `compile` inlines child interactions into the operations builder.
