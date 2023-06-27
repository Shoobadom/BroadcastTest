# Broadcast plugin
A plugin that lets OPs send messages on a server.

### Original task:
- You are to develop a basic Minecraft plugin using Spigot/Bukkit that allows server administrators to send broadcasts
- There should be a customizable prefix in the config, along with a custom permission that admins can set.
- Commands:
-  `/broadcast`
-  `<permission that is required to see the given message>`
-  `<message. should support color codes>`

Using colour codes beginning with either § or &, e.g. §c and &c both work to create red text.  
Two permissions have been created with this plugin:
- *broadcast.admin* - all OPs have this permission
- *broadcast.all* - everyone has this permissoion
   
Other permissions can also be used in conjunction with the command  
(Note that OPs automatically have access to any made up permission (e.g. "fake.perm") - this is a bukkit thing)  

### Example usage:
`/broadcast broadcast.admin Hello World!`
The above will send "\[Prefix] Hello World!" to all admin (OP) players.
