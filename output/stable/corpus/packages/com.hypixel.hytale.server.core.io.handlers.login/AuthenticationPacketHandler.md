# AuthenticationPacketHandler

Type: class | Package: com.hypixel.hytale.server.core.io.handlers.login | Extends: HandshakeHandler

public class AuthenticationPacketHandler extends HandshakeHandler

Extends `HandshakeHandler` to perform authentication during the login flow. Enforces the server's max player limit before proceeding. On successful authentication, transitions the connection to a PasswordPacketHandler for optional password verification.

## Methods


@Nonnull
@Override
public String getIdentifier()

Returns a string identifier for this handler including the remote address and auth handler supplier.


@Override
public void registered0(PacketHandler oldHandler)

Called when registered. Checks max player count and disconnects if full, otherwise delegates to the parent.


@Override
protected void onAuthenticated(byte[] passwordChallenge)

Transitions the channel to a PasswordPacketHandler after successful authentication.

## Inner Types

- **AuthHandlerSupplier** -- Functional interface for creating the next `PacketHandler` after authentication.
