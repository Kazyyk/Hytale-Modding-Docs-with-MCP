# CommandListPage

Type: class | Package: com.hypixel.hytale.server.core.command.system.pages | Extends: InteractiveCustomUIPage

public class CommandListPage extends InteractiveCustomUIPage<CommandListPage.CommandListPageEventData>

An interactive custom UI page that provides an in-game command browser. Displays a searchable list of available commands, subcommand navigation with breadcrumbs, variant selection, parameter details with type information, and a send-to-chat feature. Filters commands based on player permissions.

## Key Methods

- public void build( Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store )
- public void handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, CommandListPage.CommandListPageEventData data)
- public static final BuilderCodec<CommandListPage.CommandListPageEventData> CODEC = BuilderCodec.builder( CommandListPage.CommandListPageEventData.class, CommandListPage.CommandListPageEventData::new )
- public static final Comparator<CommandListPage.SearchResult> COMPARATOR = Comparator.comparing(o -> o.match)
