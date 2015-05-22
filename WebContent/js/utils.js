function sendMail(){
  $.ajax({
    type: "POST",
    url: "https://mandrillapp.com/api/1.0/messages/send.json",
    data: {
      'key': 'igt4UST_hHSKoFO9alfKKA',
      'message': {
        'from_email': document.mail.mailNo.value,
        'to': [
          {
            'email': 'cafe.stardusts@gmail.com',
            'name': 'Stardusts',
            'type': 'to'
          }
        ],
        'subject': document.mail.Name.value,
        'text': document.mail.inquiry.value,      }
    }
  });
}