const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function reverseWordsInSentence(sentence) {
    // Split the sentence into words
    const words = sentence.split(' ');

    // Reverse each word and store them in an array
    const reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });

    // Join the reversed words to form the reversed sentence
    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

// Get user input
rl.question('Enter a sentence: ', (input) => {
    const reversedResult = reverseWordsInSentence(input);

    // Display the reversed sentence
    console.log("Reversed sentence: " + reversedResult);
    rl.close();
});
