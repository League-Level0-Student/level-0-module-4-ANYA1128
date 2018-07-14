package extra;

import javax.swing.JOptionPane;

public class OwnStory {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,
				"Once upon a time there was a fish named Timmy.The fish wanted to visit its grandma. The fastest way to his grandma is across shark mania. How does the fish cross shark mania?");
		int task = JOptionPane.showOptionDialog(null, "How does Timmy the fish cross shark mania?", "Timmy the fish", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Be a brave fish and just cross it",
						"Pretend that he is a baby shark", "Find a way around" },
				null);
		if (task == 0) {
			JOptionPane.showMessageDialog(null,
					"Timmy was brave and faced his fears to cross shark mania. Unfortunately, Timmy comes across a shark. The shark bites Timmy's head off. RIP Timmy. THE END ");

		} else if (task == 1) {
			JOptionPane.showMessageDialog(null,
					"Timmy was clever and faced his fears to cross shark mania with a disguise. A couple sharks look at him funny, but Timmy made it across. He is ahead of schedule and keeps swimming to his Grandma's house. He reaches the house and rings the doorbell. His grandma doesnt know because his grandma is deaf. How does he get inside?  ");
			int door = JOptionPane.showOptionDialog(null, "What does Timmy do?", "Timmy the fish", 0,
					JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Keep whacking his tail against the door and whack it down",
							"try squeezing himself through the open window." },
					null);
			if (door == 0) {
				JOptionPane.showMessageDialog(null,
						"Timmy has made it in, but his grandma is sleeping. He pokes her and she wakes up, and they have a fun time. the end.");
			} else if (door == 1) {
				JOptionPane.showMessageDialog(null,
						"Timmy is stuck and can't breathe. He tries screaming for help, but nobody can hear him. RIP Timmy. THE END");
			}
		} else if (task == 2) {
			JOptionPane.showMessageDialog(null,
					"Timmy was not very brave or clever. It took him another hour to get on the main current again. As he kept swimming, Timmy became super hungry. He didnt know if he could go any further. What does he do? ");
			int hunger = JOptionPane.showOptionDialog(null, "What does Timmy do?", "Timmy the fish", 0,
					JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "JUST KEEP SWIMMING", "EAT A SEASHELL IN DESPERATION" }, null);
			if (hunger == 0) {
				JOptionPane.showMessageDialog(null,
						"Although Timmy felt really faint after some time, he realized it was all ok and kept swimming. He reached his Grandma's house super duper hungry.He rings the doorbell. His grandma doesnt know because his grandma is deaf. How does he get inside?");
				int door = JOptionPane.showOptionDialog(null, "What does Timmy do?", "Timmy the fish", 0,
						JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "Keep whacking his tail against the door and whack it down",
								"try squeezing himself through the open window." },
						null);
				
				if (door == 0) {
					JOptionPane.showMessageDialog(null,
							"Timmy has made it in, but his grandma is sleeping. He pokes her and she wakes up, and they have a fun time. the end.");
				} else if (door == 1) {
					JOptionPane.showMessageDialog(null,
							"Timmy is stuck and can't breathe. He tries screaming for help, but nobody can hear him. RIP Timmy. THE END");
				}
			}
				else if (hunger == 1) {
					JOptionPane.showMessageDialog(null, "Timmy chokes on the seashell and dies. RIP Timmy. THE END.");
				}
			
		}

	}
}
